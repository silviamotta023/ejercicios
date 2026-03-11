/*### Ejercicio 11 — Lista de pasajeros (lineal)
Una aerolínea registra los nombres de los pasajeros de un vuelo en un arreglo de `String` con capacidad para 6 personas.

- Llena el arreglo con nombres.
- Recórrelo con un `for` e imprime el número de asiento y el nombre.
- Muestra cuántos asientos están ocupados.

---*/

public class Ejercicio11 {
    public static void main(String[] args) {

        String[] pasajeros = new String[6];

        pasajeros[0] = "Silvia";
        pasajeros[1] = "Alejandra";
        pasajeros[2] = "karol";           
        pasajeros[3] = "Anderson";
        pasajeros[4] = "Mathias";
        pasajeros[5] = "Camilo";           

        int ocupados = 0;

        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null) {
                System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);
                ocupados++;
            } else {
                System.out.println("Asiento " + (i + 1) + ": LIBRE");
            }
        }

        System.out.println("\nAsientos ocupados: " + ocupados + " de " + pasajeros.length);
    }
    
}
