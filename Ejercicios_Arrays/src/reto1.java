import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] intentos = new int[8];
        int[] listaNegra = {80, 125, 500, 701, 800};
        
        System.out.println("Ingrese 8 ID:");

        for (int i = 0; i < 8; i++) {
            intentos[i] = scanner.nextInt();
        }

        int mayor = intentos[0];
        for (int i = 1; i < 8; i++) {
            if (intentos[i] > mayor) {
                mayor = intentos[i];
            }
        }

        System.out.println("ID más alto: " + mayor);


        boolean encontrado = false;

        for (int i = 0; i < listaNegra.length; i++) {
            if (listaNegra[i] == mayor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El atacante ya está en la lista negra.");
        } else {
            System.out.println("Nuevo atacante detectado.");
        }

        scanner.close();

        
    }
    
}
