package ta06;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del primer array: "));
		int array[] = new int[tamaño];
		int array2[] = new int[tamaño]; 
		
		rellenarArray(array, array2);
		
		int array3[] = calculos(array, array2); 
		mostrarArray(array, array2, array3);
	}

	private static void rellenarArray(int array[], int array2[]) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = random.nextInt(10); // random hasta el 9 para evitar numeros extremadamente grandes.
		}

	}

	public static int[] calculos(int array[], int array2[]) { 
		
		int array3[] = new int[array.length]; //Para que el array 3 coja el mismo tamaño que array y array2.
		
		for(int i = 0; i < array3.length; i++) { //puedes poner array.length porque tienen todos el mismo tamaño. 
			array3[i] = array[i] * array2[i]; 
		}
		return array3; 
	}
	
	public static void mostrarArray(int array[], int array2[], int array3[]) {		
		JOptionPane.showMessageDialog(null, "Array1: " + Arrays.toString(array) 
		+ " \n Array2: " + Arrays.toString(array2)
		+"\n Array3: " + Arrays.toString(array3));
	}

	
}
