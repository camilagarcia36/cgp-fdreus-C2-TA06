package ta06;

import javax.swing.JOptionPane;

public class Ej1 {

	public static void main(String[] args) {

		double resultado = 0;
		
		String figura = JOptionPane.showInputDialog("Introduce circulo, triangulo o cuadrado");
		

		switch (figura) {
		case "circulo":
			resultado = calcularCirculos();
			JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
			break;

		case "triangulo":
			resultado = calcularTriangulos();
			JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
			break;

		case "cuadrado":
			resultado = calcularCuadrados();
			
			JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Debes introducir una figura correcta.  ");
			break;
		}
	}

	public static double calcularCirculos() {
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("introduce el radio"));
		double resultado = Math.PI * Math.pow(radio, 2);
		return resultado;
	}

	public static double calcularTriangulos() {
		
		double base = Double.parseDouble(JOptionPane.showInputDialog("introduce la base"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("introduce la altura"));
		double resultado = (base * altura) / 2;
		
		return resultado;
	}

	public static double calcularCuadrados() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog("introduce el lado"));
		double resultado = lado * lado;
		return resultado;
	}
}
