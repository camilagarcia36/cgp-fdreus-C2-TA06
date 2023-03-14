package ta06;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ej9 {

	public static void main(String[] args) {

		int num[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array :"))];
		
		rellenar(num);
		mostrar(num); 
		
		
	}
	
	

	public static void rellenar(int num[]) {
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			 num [i] = rand.nextInt(10);
		}
	}
	
	public static void mostrar(int num[]) {
		double resultado = 0; 

		for (int i = 0; i < num.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice " + i + " valor " + num[i]);
			resultado += num[i]; //resultado = resultado + num[i]
			// 0 = 0 + 2 --> 2 = 2 + 4 --> y asi consecutivamente hasta sumar todo el array. 
		}
		JOptionPane.showMessageDialog(null, "suma de numeros: " + resultado);

	}
	
	
}
