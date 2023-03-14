package ta06;

import javax.swing.JOptionPane;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		longitud();
	}

	public static void longitud() {
		
		String num = JOptionPane.showInputDialog("Introduce numero"); 
		
		int numero = Integer.parseInt(num); 

		if (numero > 0) {
			JOptionPane.showMessageDialog(null, num.length() );
		}else {
			JOptionPane.showMessageDialog(null, "Debes introducir un numero positivo ");
	
		}
	}

}
