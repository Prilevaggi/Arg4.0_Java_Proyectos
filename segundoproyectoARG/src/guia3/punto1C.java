package guia3;
import java.util.Scanner;

public class punto1C {

	public static void main(String[] args) {
		int cant,numero,i,suma=0;
		System.out.println("ingrese la cantidad de elemntos del arreglo");
		Scanner cantidad = new Scanner(System.in);
		cant=cantidad.nextInt();
		int[] vector=new int[cant];
		System.out.println("ingrese valores ");
		for(i=0;i<cant;i++) {
			System.out.println("posicion "+(i+1));
			vector[i]=cantidad.nextInt();
			}
		System.out.println("ingrese el minimo que desea sumar");
		numero=cantidad.nextInt();
		for(i=0;i<cant;i++) {
			if(vector[i]>numero) {
				suma+=vector[i];
			}
		
		}
		System.out.println("la suma de los elementos mayores al numero ingresado es "+suma);
		 
		
	}

}
