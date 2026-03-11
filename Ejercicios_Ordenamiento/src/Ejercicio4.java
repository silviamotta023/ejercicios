package Ejercicios_Ordenamiento.src;
/* 4. Registro Alfabético de Estudiantes
Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada en 
el sistema se ordene alfabéticamente de la A a la Z.
Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar 
sus nombres (cadenas de texto).
Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
Requisito técnico: El estudiante debe investigar y aplicar el método 
nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es mayor a 0, 
el primer nombre es alfabéticamente "mayor" que el segundo.
Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto. */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la cantidad de estudiantes: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Lista original:");
        imprimir(nombres);

        for (int i = 1; i < n; i++) {

            String clave = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(clave) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }

            nombres[j + 1] = clave;
        }

        System.out.println("lista ordenada alfabéticamente:");
        imprimir(nombres);

        scanner.close();
    }

    public static void imprimir(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
