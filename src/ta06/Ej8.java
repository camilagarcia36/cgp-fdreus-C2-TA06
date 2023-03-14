package ta06;

import javax.swing.JOptionPane;

public class Ej8 {

	public static void main(String[] args) {

		int num[] = new int[10];

		llenarArray(num); 
		mostrar(num); 
	}

	// Hay que llamar las variables en el metodo (int num[])
	
	public static void llenarArray(int num[]) {
		for (int i = 0; i < num.length; i++) {

			//el numero en la posiion i es igual al numero que pides por pantalla. 
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros: ")); 
			// i es la posicion dentro del array.
		}

	}

	
	public static void mostrar(int num[]) {
		for (int i = 0; i < num.length; i++) {  //recorrer el array. Las veces son num.lenght. 
		JOptionPane.showMessageDialog(null, "Indice " + i + " valor " +  num[i]);
		}
	}
}