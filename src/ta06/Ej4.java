package ta06;

import javax.swing.JOptionPane;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		  
	        long factorial = calculo(num);
	        JOptionPane.showMessageDialog(null, "El factorial es " + factorial);
	    }

	
	
	
	    public static long calculo(int num) {
	    	
	        long factorial = 1;
	        for (int i = num; i > 0; i--) {
	            factorial *= i;
	        }
	        
	        
	        return factorial;
	    }
	}
