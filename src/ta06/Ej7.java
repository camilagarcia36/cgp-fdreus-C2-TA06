package ta06;

import javax.swing.JOptionPane;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conversion();
	}

	public static void conversion() {

		double cantidad = Double
				.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieres convertir en euro "));

		String moneda = JOptionPane.showInputDialog("Elige la moneda de conversion");

		Double cambio = 0.0;
		String mensaje = ""; 

		switch (moneda.toLowerCase()) {

		case "libras":
			cambio = cantidad * 0.86;
			 mensaje =  "El cambio a libras es "; 
			break;
			
		case "dolares":
			cambio = cantidad * 1.28611;
			 mensaje = "El cambio a dolares es " ; 


			break;
		case "yenes":
			cambio = cantidad + 129.852;
			 mensaje = "El cambio a yenes es "; 

			break;

		default:
			JOptionPane.showMessageDialog(null, "No has elegido una moneda ");

		}
		JOptionPane.showMessageDialog(null, mensaje + cambio );

	}

}
