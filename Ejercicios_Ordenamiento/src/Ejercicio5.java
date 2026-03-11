package Ejercicios_Ordenamiento.src;

import java.util.Scanner;

/* 5. El Inspector de Eficiencia (Duelo de Métodos)
Algoritmos obligatorios: Selección vsInserción

Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de 
operaciones para un caso específico.
Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa 
aplica métodos AMBOS al mismo conjunto de datos (puedes usar una copia del arreglo original).
Lógica de Conteo:
En Selección : Cuenta cada vez que ocurre un swap(intercambio físico de posiciones).
En Inserción : Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos 
hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados ​​por 
el teclado. */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = 6;
        int[] numeros = new int[n];

        System.out.println("ingrese 6 numeros enteros:");

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] seleccion = numeros.clone();
        int[] insercion = numeros.clone();

        int swapsSeleccion = selectionSort(seleccion);
        int movimientosInsercion = insertionSort(insercion);

        System.out.println("Arreglo original:");
        imprimir(numeros);

        System.out.println("Resultado Selection Sort:");
        imprimir(seleccion);

        System.out.println("Cantidad de intercambios (swaps): " + swapsSeleccion);

        System.out.println("Resultado Insertion Sort:");
        imprimir(insercion);

        System.out.println("Cantidad de movimientos: " + movimientosInsercion);

        System.out.println("Analisis de eficiencia:");

        if (swapsSeleccion < movimientosInsercion) {
            System.out.println("Selection Sort fue mas eficiente para estos datos.");
        } else if (movimientosInsercion < swapsSeleccion) {
            System.out.println("Insertion Sort fue mas eficiente para estos datos.");
        } else {
            System.out.println("Ambos algoritmos tuvieron la misma eficiencia.");
        }

        scanner.close();
    }

    public static int selectionSort(int[] arr) {

        int swaps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

                swaps++;
            }
        }

        return swaps;
    }

    public static int insertionSort(int[] arr) {

        int movimientos = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > clave) {

                arr[j + 1] = arr[j];
                j--;

                movimientos++;
            }

            arr[j + 1] = clave;
        }

        return movimientos;
    }

    public static void imprimir(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
    }
    

}
