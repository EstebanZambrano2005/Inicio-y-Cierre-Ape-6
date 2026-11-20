import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piezas = new int[10];

        // Ingreso de datos
        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Ingrese las piezas fabricadas en el turno " + (i + 1) + ": ");
            piezas[i] = sc.nextInt();
        }

        int sumaIndicesPares = 0;   // suma de las posiciones 0, 2, 4...
        int turnosImparesMayores15 = 0;
        int sumaTotal = 0;

        for (int i = 0; i < piezas.length; i++) {
            // Suma solo de índices pares
            if (i % 2 == 0) {
                sumaIndicesPares += piezas[i];
            }

            // Turnos con cantidad impar y mayor a 15
            if (piezas[i] % 2 != 0 && piezas[i] > 15) {
                turnosImparesMayores15++;
            }

            // Suma total para el promedio
            sumaTotal += piezas[i];
        }

        double promedio = (double) sumaTotal / piezas.length;

        System.out.println("\nSuma de piezas en índices pares: " + sumaIndicesPares);
        System.out.println("Turnos con cantidad impar y mayor a 15: " + turnosImparesMayores15);
        System.out.printf("Promedio general de producción: %.2f%n", promedio);

        sc.close();
    }
}
