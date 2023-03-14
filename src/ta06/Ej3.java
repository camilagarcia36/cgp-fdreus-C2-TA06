package ta06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej3 {

	    
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        
        int numero = input.nextInt();
        
        boolean esPrimo = esPrimo(numero);
        
        if (esPrimo) {
            System.out.println(esPrimo );
        } else {
            System.out.println(esPrimo );
            
        }
    }
    
    public static boolean esPrimo(int numero) {
    	
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
    
        return true;
    }
}