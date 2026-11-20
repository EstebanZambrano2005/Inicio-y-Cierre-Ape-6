import java.util.Arrays;

public class PruebasEscritorioCierre {

    public static void main(String[] args) {
        pruebaEjercicio1(7);   // caso que existe (aparece 2 veces)
        pruebaEjercicio1(99);  // caso que no existe
        pruebaEjercicio2();
        pruebaEjercicio3();
    }

    // =====================================================
    // EJERCICIO 1: Busqueda y conteo
    // =====================================================
    public static void pruebaEjercicio1(int buscado) {
        System.out.println("==================================================");
        System.out.println("EJERCICIO 1: Busqueda y conteo (buscado = " + buscado + ")");
        System.out.println("==================================================");

        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        System.out.println("Datos: numeros = [14, 7, 25, 3, 18, 7, 30]");
        System.out.println("Valores iniciales: contador = 0, posicion = -1\n");

        System.out.printf("%-4s %-12s %-18s %-10s %-10s%n",
                "i", "numeros[i]", "numeros[i]==" + buscado + "?", "contador", "posicion");
        int contador = 0;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            boolean igual = (numeros[i] == buscado);
            if (igual) {
                contador++;
                if (posicion == -1) {
                    posicion = i;
                }
            }
            System.out.printf("%-4d %-12d %-18s %-10d %-10d%n",
                    i, numeros[i], igual ? "Si" : "No", contador, posicion);
        }

        System.out.println("\nSalida en pantalla:");
        if (posicion == -1) {
            System.out.println("No existe");
        } else {
            System.out.println("El numero " + buscado + " aparece " + contador + " vez/veces.");
            System.out.println("Primera posicion (indice): " + posicion);
        }
        System.out.println();
    }

    // =====================================================
    // EJERCICIO 2: Maximo y minimo con arreglos paralelos
    // =====================================================
    public static void pruebaEjercicio2() {
        System.out.println("==================================================");
        System.out.println("EJERCICIO 2: Maximo y minimo con arreglos paralelos");
        System.out.println("==================================================");

        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};
        System.out.println("Datos: nombres = [Ana, Luis, Marta, Pedro], notas = [15, 8, 18, 11]");
        System.out.println("Valores iniciales: posMax = 0, posMin = 0, suma = 0\n");

        System.out.printf("%-4s %-8s %-7s %-16s %-16s %-8s %-8s %-6s%n",
                "i", "nombre", "nota", "nota>notas[posMax]?", "nota<notas[posMin]?", "posMax", "posMin", "suma");
        int posMax = 0;
        int posMin = 0;
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            boolean mayor = notas[i] > notas[posMax];
            boolean menor = notas[i] < notas[posMin];
            if (mayor) {
                posMax = i;
            }
            if (menor) {
                posMin = i;
            }
            suma += notas[i];
            System.out.printf("%-4d %-8s %-7d %-19s %-19s %-8d %-8d %-6d%n",
                    i, nombres[i], notas[i], mayor ? "Si" : "No", menor ? "Si" : "No",
                    posMax, posMin, suma);
        }

        double promedio = (double) suma / notas.length;
        System.out.printf("%npromedio = (double) %d / %d = %.2f%n", suma, notas.length, promedio);

        System.out.println("\nSalida en pantalla:");
        System.out.println("Nota mas alta: " + nombres[posMax] + " con " + notas[posMax]);
        System.out.println("Nota mas baja: " + nombres[posMin] + " con " + notas[posMin]);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println();
    }

    // =====================================================
    // EJERCICIO 3: Integrador con java.util.Arrays
    // =====================================================
    public static void pruebaEjercicio3() {
        System.out.println("==================================================");
        System.out.println("EJERCICIO 3: Integrador con java.util.Arrays");
        System.out.println("==================================================");

        int[] datos = {14, 7, 25, 3, 18};
        System.out.println("Datos: datos = [14, 7, 25, 3, 18]\n");

        System.out.println("Paso 1: copia = Arrays.copyOf(datos, datos.length)");
        int[] copia = Arrays.copyOf(datos, datos.length);
        System.out.println("  datos = " + Arrays.toString(datos));
        System.out.println("  copia = " + Arrays.toString(copia));

        System.out.println("\nPaso 2: Arrays.sort(copia)  (solo se ordena la copia)");
        Arrays.sort(copia);
        System.out.println("  datos = " + Arrays.toString(datos) + "   (no cambia)");
        System.out.println("  copia = " + Arrays.toString(copia));

        System.out.println("\nPaso 3: segundo mayor = copia[copia.length - 2]");
        int segundoMayor = copia[copia.length - 2];
        System.out.println("  copia.length = " + copia.length + ", indice = " + (copia.length - 2)
                + ", segundoMayor = " + segundoMayor);

        System.out.println("\nPaso 4: busqueda binaria del 14 en la copia ordenada");
        System.out.printf("  %-8s %-6s %-6s %-12s %-22s%n", "vuelta", "bajo", "alto", "medio", "copia[medio] vs 14");
        int bajo = 0;
        int alto = copia.length - 1;
        int vuelta = 1;
        int encontrado = -1;
        while (bajo <= alto && encontrado == -1) {
            int medio = (bajo + alto) / 2;
            String comparacion;
            if (copia[medio] == 14) {
                comparacion = copia[medio] + " == 14 (encontrado)";
                encontrado = medio;
            } else if (copia[medio] < 14) {
                comparacion = copia[medio] + " < 14 (buscar a la derecha)";
                bajo = medio + 1;
            } else {
                comparacion = copia[medio] + " > 14 (buscar a la izquierda)";
                alto = medio - 1;
            }
            System.out.printf("  %-8d %-6d %-6d %-12d %-22s%n", vuelta, bajo, alto, medio, comparacion);
            vuelta++;
        }
        System.out.println("  Resultado manual: posicion " + encontrado
                + " | Arrays.binarySearch: " + Arrays.binarySearch(copia, 14));

        System.out.println("\nSalida en pantalla:");
        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));
        System.out.println("Segundo numero mayor: " + segundoMayor);
        System.out.println("Posicion del 14 en la copia: " + Arrays.binarySearch(copia, 14));
        System.out.println();
    }
}
