public class PruebasEscritorio {

    public static void main(String[] args) {
        pruebaEjercicio1();
        pruebaEjercicio2();
        pruebaEjercicio3();
    }

    // =====================================================
    // EJERCICIO 1: Control de gastos semanales
    // =====================================================
    public static void pruebaEjercicio1() {
        System.out.println("==================================================");
        System.out.println("EJERCICIO 1: Control de gastos semanales");
        System.out.println("==================================================");

        double[] gastos = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Datos de entrada: gastos = [10, 20, 30, 40, 50, 60, 70]\n");

        // Tabla 1: gasto total
        System.out.println("Tabla 1: Calculo del gasto total");
        System.out.printf("%-4s %-12s %-18s%n", "i", "gastos[i]", "total (acumulado)");
        double total = 0;
        for (int i = 0; i < gastos.length; i++) {
            total += gastos[i];
            System.out.printf("%-4d %-12.1f %-18.1f%n", i, gastos[i], total);
        }
        double promedio = total / gastos.length;
        System.out.printf("%npromedio = %.1f / %d = %.1f%n%n", total, gastos.length, promedio);

        // Tabla 2: aumento del 10%
        System.out.println("Tabla 2: Ajuste del 10% a los dias sobre el promedio");
        System.out.printf("%-4s %-16s %-18s %-18s %-15s%n",
                "i", "gastos[i] antes", "gastos[i] > prom?", "gastos[i] despues", "diasConAumento");
        int diasConAumento = 0;
        for (int i = 0; i < gastos.length; i++) {
            double antes = gastos[i];
            boolean supera = gastos[i] > promedio;
            if (supera) {
                gastos[i] = gastos[i] * 1.10;
                diasConAumento++;
            }
            System.out.printf("%-4d %-16.1f %-18s %-18.2f %-15d%n",
                    i, antes, supera ? "Si" : "No", gastos[i], diasConAumento);
        }

        // Salida
        System.out.println("\nSalida en pantalla:");
        System.out.println("Arreglo actualizado (orden inverso):");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Dia %d: %.2f%n", (i + 1), gastos[i]);
        }
        System.out.println("Dias que sufrieron el incremento: " + diasConAumento);
        System.out.println();
    }

    // =====================================================
    // EJERCICIO 2: Filtro y suma condicionada de produccion
    // =====================================================
    public static void pruebaEjercicio2() {
        System.out.println("==================================================");
        System.out.println("EJERCICIO 2: Filtro y suma condicionada");
        System.out.println("==================================================");

        int[] piezas = {12, 17, 8, 21, 15, 30, 19, 14, 25, 10};
        System.out.println("Datos de entrada: piezas = [12, 17, 8, 21, 15, 30, 19, 14, 25, 10]\n");

        System.out.println("Tabla de seguimiento");
        System.out.printf("%-4s %-10s %-10s %-18s %-14s %-24s %-10s%n",
                "i", "piezas[i]", "i par?", "sumaIndicesPares", "impar y >15?",
                "turnosImparesMayores15", "sumaTotal");

        int sumaIndicesPares = 0;
        int turnosImparesMayores15 = 0;
        int sumaTotal = 0;

        for (int i = 0; i < piezas.length; i++) {
            boolean indicePar = (i % 2 == 0);
            boolean imparMayor15 = (piezas[i] % 2 != 0 && piezas[i] > 15);

            if (indicePar) {
                sumaIndicesPares += piezas[i];
            }
            if (imparMayor15) {
                turnosImparesMayores15++;
            }
            sumaTotal += piezas[i];

            System.out.printf("%-4d %-10d %-10s %-18d %-14s %-24d %-10d%n",
                    i, piezas[i], indicePar ? "Si" : "No", sumaIndicesPares,
                    imparMayor15 ? "Si" : "No", turnosImparesMayores15, sumaTotal);
        }

        double promedio = (double) sumaTotal / piezas.length;
        System.out.printf("%npromedio = (double) %d / %d = %.1f%n", sumaTotal, piezas.length, promedio);

        System.out.println("\nSalida en pantalla:");
        System.out.println("Suma de piezas en indices pares: " + sumaIndicesPares);
        System.out.println("Turnos con cantidad impar y mayor a 15: " + turnosImparesMayores15);
        System.out.printf("Promedio general de produccion: %.2f%n", promedio);
        System.out.println();
    }

    // =====================================================
    // EJERCICIO 3: Analisis de asistencia y rendimiento
    // =====================================================
    public static void pruebaEjercicio3() {
        System.out.println("==================================================");
        System.out.println("EJERCICIO 3: Analisis de asistencia y rendimiento");
        System.out.println("==================================================");

        int n = 6;
        // Notas que "ingresa el usuario" en orden. La 25 es invalida y se repite.
        int[] entradas = {18, 25, 12, 15, 9, 20, 14};
        int[] notas = new int[n];
        System.out.println("Datos de entrada: n = 6, notas ingresadas = 18, 25, 12, 15, 9, 20, 14\n");

        // Tabla 1: llenado con validacion
        System.out.println("Tabla 1: Llenado del arreglo con validacion");
        System.out.printf("%-4s %-12s %-15s %-22s %-10s%n",
                "i", "Estudiante", "Nota ingresada", "Valida (0 a 20)?", "notas[i]");
        int pos = 0; // posicion en el arreglo de entradas
        for (int i = 0; i < n; i++) {
            int nota;
            do {
                nota = entradas[pos];
                pos++;
                boolean valida = (nota >= 0 && nota <= 20);
                System.out.printf("%-4d %-12d %-15d %-22s %-10s%n",
                        i, (i + 1), nota,
                        valida ? "Si" : "No (se repite)",
                        valida ? String.valueOf(nota) : "-");
            } while (nota < 0 || nota > 20);
            notas[i] = nota;
        }

        // Tabla 2: suma, aprobados y reprobados
        System.out.println("\nTabla 2: Suma, aprobados y reprobados");
        System.out.printf("%-4s %-10s %-18s %-14s %-11s %-11s%n",
                "i", "notas[i]", "suma (acumulada)", "nota >= 14?", "aprobados", "reprobados");
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
            boolean aprueba = notas[i] >= 14;
            if (aprueba) {
                aprobados++;
            } else {
                reprobados++;
            }
            System.out.printf("%-4d %-10d %-18d %-14s %-11d %-11d%n",
                    i, notas[i], suma, aprueba ? "Si" : "No", aprobados, reprobados);
        }

        double promedio = (double) suma / n;
        System.out.printf("%npromedio = (double) %d / %d = %.4f (se muestra como %.2f)%n%n",
                suma, n, promedio, promedio);

        // Tabla 3: notas por debajo del promedio
        System.out.printf("Tabla 3: Estudiantes con nota menor al promedio (%.2f)%n", promedio);
        System.out.printf("%-4s %-12s %-10s %-20s%n", "i", "Estudiante", "notas[i]", "notas[i] < promedio?");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-12d %-10d %-20s%n",
                    i, (i + 1), notas[i], notas[i] < promedio ? "Si" : "No");
        }

        System.out.println("\nSalida en pantalla:");
        System.out.printf("Promedio general del curso: %.2f%n", promedio);
        System.out.println("Estudiantes aprobados (nota >= 14): " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        System.out.println("Estudiantes con nota por debajo del promedio:");
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1) + " (nota: " + notas[i] + ")");
            }
        }
        System.out.println();
    }
}
