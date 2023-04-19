
package guia3;

import java.util.Scanner;



public class punto1A {

	public static void main(String[] args) {
		

  Scanner cadena = new Scanner(System.in);
  char letra;
  String cadena1;
  int i,contador=0;
 
  System.out.println("ingrese una cadena:");
  cadena1= cadena.nextLine();
 
  System.out.println("ingrese un caracter:");
  letra= cadena.next().charAt(0);
  
  for(i=0;i<cadena1.length();i++) {
	  if(cadena1.charAt(i)==letra) {
		  contador++;
	  }
  }
  
  System.out.println("la letra ingresada se encontro " +contador+" veces en la cadena");
  
	}

}
