import java.util.Arrays;

public class CierreEjercicio3 {
    public static void main(String[] args) {
        int[] datos = {14, 7, 25, 3, 18};

        // Copia real: un arreglo nuevo, no otra referencia al mismo arreglo
        int[] copia = Arrays.copyOf(datos, datos.length);

        // Se ordena solo la copia; el original queda intacto
        Arrays.sort(copia);

        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        // En la copia ordenada, el mayor está al final y el segundo mayor justo antes
        int segundoMayor = copia[copia.length - 2];
        System.out.println("Segundo número mayor: " + segundoMayor);

        // binarySearch solo funciona bien sobre un arreglo ya ordenado (la copia)
        int posicion14 = Arrays.binarySearch(copia, 14);
        System.out.println("Posición del 14 en la copia: " + posicion14);
    }
}
