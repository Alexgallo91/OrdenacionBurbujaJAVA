
public class OrdenamientBurbuja {

	public static int[] ordenamientoBurbuja(int num1, int num2) {
		int aux;
		int arreglo[] = new int[3];

		if (num1 > num2) {
			aux = num2;
			num2 = num1;
			num1 = aux;

			arreglo[0] = num1;
			arreglo[1] = num2;
			arreglo[2] = 1;
		} else {
			arreglo[0] = num1;
			arreglo[1] = num2;
			arreglo[2] = 0;
		}
		return arreglo;
	}
}
