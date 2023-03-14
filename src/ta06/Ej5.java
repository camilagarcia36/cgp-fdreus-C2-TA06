package ta06;


import javax.swing.JOptionPane;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		        int decimal = Integer.parseInt(JOptionPane.showInputDialog("Introduce un decimal"));
		        
		        String binario = conversion(decimal);
		        JOptionPane.showMessageDialog(null, "El número en binario es " + binario);
		    }
	
	

		    public static String conversion(int decimal) {
		        String binario = "";
		        
		        while (decimal > 0) {
		            int resto = decimal % 2;
		            binario = resto + binario;
		            
		            decimal = decimal / 2;
		        }
		        return binario;
		    }
		}
