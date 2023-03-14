package ta06;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ej10 {

	// Revisar

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("¿Tamaño del array?"));
		int array[] = new int[num1];
		rellenarArray(array);
		mostrarArray(array);
		numeroMayor(array);

	}

	public static void rellenarArray(int array[]) {
		int rangoMax = Integer.parseInt(JOptionPane.showInputDialog("Hasta que numero quieres generar los random: "));
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int num1 = random.nextInt(rangoMax); // genera el numero random hasta el numero que le indiquemos.
			if (primo(num1) == true) {
				array[i] = num1; // añade el numero al array si es primo
			} else {
				i--; // resta a la posicion para volver a generar un random en esa posicion hasta que
						// sea primo.
			}
		}

	}

	public static boolean primo(int num1) {

		int contador = 2;
		boolean resultado = true;
		while ((resultado) && (contador != num1)) {
			if (num1 % contador == 0)
				resultado = false;
			contador++;
		}
		return resultado;

	}

	public static void numeroMayor(int array[]) {
		int nMayor = 0;
		for (int i = 0; i < array.length; i++) {
			nMayor = Math.max(nMayor, array[i]);
		}

		JOptionPane.showMessageDialog(null, "Primo mayor: " + nMayor);
	}

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice " + i + " valor " + array[i]);
		}
	}

}
