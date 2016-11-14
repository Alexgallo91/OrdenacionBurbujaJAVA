import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arreglo[];
		int tamanio;
		int seguimiento = 1;
		Random gen = new Random();

		System.out.println("Ingrese el numero de casillas para el arreglo:");
		tamanio = sc.nextInt();

		arreglo = new int[tamanio];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = gen.nextInt(100);
			System.out.printf("[%d]", arreglo[i]);
		}
		System.out.println();

		while (true) {
			/* ordenamiento burbuja */
			for (int i = 0; i < arreglo.length - 1; i++) {
				int[] arreglo2 = new int[3];
				arreglo2 = OrdenamientBurbuja.ordenamientoBurbuja(arreglo[i], arreglo[i + 1]);
				arreglo[i] = arreglo2[0];
				arreglo[i + 1] = arreglo2[1];

				if (arreglo2[2] == 1) {
					seguimiento = 1;
				}
			}

			if (seguimiento == 1) {
				seguimiento = 0;
				continue;
			} else {
				break;
			}
		}

		System.out.println("Arreglo ordenado:\n");

		for (int i = 0; i < arreglo.length; i++) {
			System.out.printf("[%d]", arreglo[i]);
		}
	}
}
