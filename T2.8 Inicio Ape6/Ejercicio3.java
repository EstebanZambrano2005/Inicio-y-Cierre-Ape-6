import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();

        int[] notas = new int[n];

        // Llenar el arreglo validando que la nota esté entre 0 y 20
        for (int i = 0; i < n; i++) {
            int nota;
            do {
                System.out.print("Ingrese la nota del Estudiante " + (i + 1) + " (0-20): ");
                nota = sc.nextInt();
                if (nota < 0 || nota > 20) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 20.");
                }
            } while (nota < 0 || nota > 20);
            notas[i] = nota;
        }

        // Promedio general (sin división entera)
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = (double) suma / n;

        System.out.printf("%nPromedio general del curso: %.2f%n", promedio);
        System.out.println("Estudiantes aprobados (nota >= 14): " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        // Estudiantes con nota estrictamente menor al promedio
        System.out.println("\nEstudiantes con nota por debajo del promedio:");
        boolean hayEstudiantes = false;
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1) + " (nota: " + notas[i] + ")");
                hayEstudiantes = true;
            }
        }
        if (!hayEstudiantes) {
            System.out.println("Ninguno.");
        }

        sc.close();
    }
}
