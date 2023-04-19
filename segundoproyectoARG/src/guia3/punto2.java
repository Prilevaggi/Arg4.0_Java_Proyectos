package guia3;
import java.util.Scanner;
public class punto2 {
	

	public static void main(String[] args) {
    Scanner lista = new Scanner(System.in);
	String linea;
	int i;
	
	 System.out.println("ingrese 10 nombres separados por un espacio:");
	linea=lista.nextLine();
	
	String[] nombres= linea.split(" ");
	
	 System.out.println("vector de nombres creado:");
	for(i=0;i<nombres.length;i++) {
		 System.out.println("["+nombres[i]+"]");
	}
	
	}

}
