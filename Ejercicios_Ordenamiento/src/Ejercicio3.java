package Ejercicios_Ordenamiento.src;
/* 3. El Salto de Shell (Optimización de Datos)
Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos 
de forma más eficiente que el método de burbuja o inserción simple.
Detalle del ejercicio: Solicita al usuario el peso de Npaquetes (se recomienda probar con al 
menos 10 para notar el efecto).
Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial denorte /2. El estudiante 
debe explicar en comentarios por qué este método es generalmente más rápido que la inserción simple 
al trabajar con elementos que están muy lejos de su posición final.
Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar 
todas las fases de reducción de saltos. */

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la cantidad de paquetes: ");
        int n = scanner.nextInt();

        int[] pesos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = scanner.nextInt();
        }

        System.out.println("arreglo original:");
        imprimir(pesos);

        int gap = n / 2;

        while (gap > 0) {

            for (int i = gap; i < n; i++) {

                int temp = pesos[i];
                int j = i;

                while (j >= gap && pesos[j - gap] > temp) {
                    pesos[j] = pesos[j - gap];
                    j = j - gap;
                }

                pesos[j] = temp;
            }

            gap = gap / 2; 
        }

        System.out.println("arreglo ordenado:");
        imprimir(pesos);

        scanner.close();
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
