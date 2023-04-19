package guia3;

import java.util.Scanner;

public class punto1B {

	public static void main(String[] args) {
		int num1,num2,num3,aux=0,i,ent;
		int[] numeros = new int[3];
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("ingrese numero 1 ");
		num1=entrada.nextInt();
		System.out.print("ingrese numero 2 ");
		num2=entrada.nextInt();
		System.out.print("ingrese numero 3 ");
		num3=entrada.nextInt();
		
	
			if((num1<num2)&&(num2<num3)) {
				numeros[0]=num1;
				numeros[1]=num2;
				numeros[2]=num3;
			}
			if((num1<num3)&&(num3<num2)) {
				numeros[0]=num1;
				numeros[1]=num3;
				numeros[2]=num2;
			}
			if((num2<num1)&&(num1<num3)) {
				numeros[0]=num2;
				numeros[1]=num1;
				numeros[2]=num3;
			}
			if((num2<num3)&&(num3<num1)) {
				numeros[0]=num2;
				numeros[1]=num3;
				numeros[2]=num1;
			}
			if((num3<num1)&&(num1<num2)) {
				numeros[0]=num3;
				numeros[1]=num1;
				numeros[2]=num2;
			}
			if((num3<num2)&&(num2<num1)) {
				numeros[0]=num3;
				numeros[1]=num2;
				numeros[2]=num1;
			}
			System.out.println("mostrando el vector en forma ascendente:");
			for(i=0;i<3;i++) {
				System.out.print(numeros[i]+" ");
			}
				
				
				
	
		
		
	}

}
