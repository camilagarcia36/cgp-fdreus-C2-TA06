package ta06;


import javax.swing.JOptionPane;
import java.util.Random;

public class Ej2 {
	

	public static void main(String[] args) {
		
		
		
		int numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de numeros aleatorios que quieres obtener: ")); 
		int nMin = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor minimo de los numeros aleatorios: ")); 

		int nMax = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor maximo de los numeros aleatorios: ")); 

		for (int i = 0; i < numeros; i++) {
			int numeroAleatorio = generarNumeroAleatorio(nMin, nMax);
			
			JOptionPane.showMessageDialog(null, "Numero aleatorio "+ (i + 1) + ": " + numeroAleatorio);
			}
		
		}
		
	
	
	public static int generarNumeroAleatorio(int nMinimo, int nMaximo) {
		Random random = new Random(); 
		int numeroAleatorio = random.nextInt((nMaximo - nMinimo) + 1) + nMinimo; 
		return numeroAleatorio; 
	}
}
