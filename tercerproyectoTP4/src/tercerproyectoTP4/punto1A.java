package tercerproyectoTP4;
import java.util.Scanner;
public class punto1A {

	public static void main(String[] args) {
		 int n1=2,n2=4,n3=0;
		 char o;
		 Scanner asodes=new Scanner(System.in);
		 System.out.print("ingrese A para ordenar de forma ascendente o D para Ordenar de forma descendente:");
		 o=asodes.next().charAt(0);
		 orden(n1,n2,n3,o);
		 
		 
	}

	private static void orden (int x, int y ,int z ,char a) {
		int i,j,aux=0;
		int [] vector= {x,y,z};
		if(a=='D') {
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(vector [i]> vector[j]) {
					aux=vector[i];
				vector[i]=vector[j];
				vector[j]=aux;
			}}
		}
		}

		if(a=='A') {
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					if(vector [i]< vector[j]) {
						aux=vector[i];
					vector[i]=vector[j];
					vector[j]=aux;
				}}
			}
			}
		
		System.out.print("mostrando numeros ordenados de forma indicada ");
		
		for(i=0;i<3;i++)
			System.out.print("-" +vector[i]+" - ");
}
}