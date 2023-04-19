package tercerproyectoTP4;
import java.util.Scanner;
public class Punto1C {

	public static void main(String[] args) {
		int op;
		
		do {
		System.out.print("ingrese :\n1- para ordenar los numeros almacenados \n2-para ingresar numeros por consola.\n3-para finalizar\n" );
		Scanner eleccion= new Scanner(System.in);
      op=eleccion.nextInt();
      opcion(op);
	    }
		while(op!=3);}
private static void opcion(int op) {
	if (op==1) {
		int n1=2;
		int n2=4;
		int n3 = 9;
		orden(n1,n2,n3);
		
	}
	if (op==2) {
		Scanner eleccion=new Scanner(System.in);
		System.out.println("ingrese tres numeros enteros al azar :");
		int n1 =eleccion.nextInt();
		int n2 = eleccion.nextInt();
		int  n3=eleccion.nextInt();
		 orden(n1,n2,n3);
		 
		
	}
	
}
private static void orden (int x, int y ,int z ) {
	int i,j,aux=0;
	char orden;
	int [] vector= {x,y,z};
	System.out.println("ingrese a para ordenar de forma ascendente o b para ordenar de forma descendente");
	Scanner aod= new Scanner(System.in);
	orden=aod.next().charAt(0);
	if(orden=='d') {
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			if(vector [i]> vector[j]) {
				aux=vector[i];
			vector[i]=vector[j];
			vector[j]=aux;
		}}
	}
	}

	if(orden=='a') {
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
