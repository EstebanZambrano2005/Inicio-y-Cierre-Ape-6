import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[7];

        // 1. Registrar los gastos de los 7 días
        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Ingrese el gasto del día " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();
        }

        // 2. Calcular gasto total y promedio diario
        double total = 0;
        for (int i = 0; i < gastos.length; i++) {
            total += gastos[i];
        }
        double promedio = total / gastos.length;

        System.out.println("\nGasto total de la semana: " + total);
        System.out.printf("Promedio diario: %.2f%n", promedio);

        // 3. Aumentar 10% a los días que superaron el promedio
        int diasConAumento = 0;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] = gastos[i] * 1.10;
                diasConAumento++;
            }
        }

        // 4. Mostrar el arreglo actualizado en orden inverso
        System.out.println("\nArreglo actualizado (orden inverso):");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Día %d: %.2f%n", (i + 1), gastos[i]);
        }

        System.out.println("\nDías que sufrieron el incremento: " + diasConAumento);

        sc.close();
    }
}
