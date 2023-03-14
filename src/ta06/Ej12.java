package ta06;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número en el que quieres que acabe"));
		int array[] = new int[num1];

		rellenarArray(array);
		mostrarFinal(array, numFinal);
	}

	public static void rellenarArray(int array[]) {
		Random claseRandom = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = claseRandom.nextInt(300);
		}
	}

	public static void mostrarFinal(int array[], int numfinal) {
		int contador = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == numfinal) { // modulo de java para encontrar el ultmo digito.
				JOptionPane.showMessageDialog(null, "Array:  " + Arrays.toString(array) + " \n numeros que acaban en: "
						+ numfinal + " son " + array[i]);

				contador++;
			}
		}
		if (contador == 0) {
			JOptionPane.showMessageDialog(null, "No hay ninguno que acabe en " + numfinal);
		}
	}
}
