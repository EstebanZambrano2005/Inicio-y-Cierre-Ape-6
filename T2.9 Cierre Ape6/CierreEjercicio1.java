import java.util.Scanner;

public class CierreEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};

        System.out.print("Ingrese el número a buscar: ");
        int buscado = sc.nextInt();

        int contador = 0;
        int posicion = -1; // -1 significa que todavía no se ha encontrado

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
                // Solo guardamos la primera vez que aparece
                if (posicion == -1) {
                    posicion = i;
                }
            }
        }

        if (posicion == -1) {
            System.out.println("No existe");
        } else {
            System.out.println("El número " + buscado + " aparece " + contador + " vez/veces.");
            System.out.println("Primera posición (índice): " + posicion);
        }

        sc.close();
    }
}
