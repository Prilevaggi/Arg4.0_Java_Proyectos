package tercerproyectoTP4;

import java.io.File;
import java.util.Scanner;

public class punto2 {

	public static void main(String[] args) {

		lecturaTxt();
		
		
		
	}
	public static void lecturaTxt() {
		Scanner archivo=null;
		int num=0,suma=0;
		try {
			archivo= new Scanner(new File("C:\\Users\\prile\\eclipse-workspace\\tercerproyectoTP4\\texto.txt"));
			while(archivo.hasNext()) {
				num=archivo.nextInt();
				suma=suma+num;
				
				System.out.print(num+" ");
				
			}
			System.out.println(num);
			System.out.println("la suma de los numeros del archivo es "+suma);
		}
		
		catch(Exception E) {
			System.out.println("no se encontro el archivo");
		}
		
	}
}
