package primerproyecto;

public class guia1 {

	public static void main(String[] args) {
	
		int inicio=5, fin=14 ,i;
		boolean desicion;
		//punto1
		
		//A
		/*while(inicio<=fin) {
			System.out.print(""+inicio);
			System.out.print(" ");
			inicio++;*/
		
		//B
		/*while(inicio<=fin) {
			if(inicio%2==0) {
			System.out.print(""+inicio);
			System.out.print(" ");}
			inicio++;}*/
		
		//C
		/*while(inicio<=fin) {
			if(inicio%2==0) {
				desicion= true;}
			if(inicio%2!=0){
				desicion= false;}
			if(desicion==true) {
			System.out.print(""+inicio);
			System.out.print(" ");}
			inicio++;
			}*/
			
			
		//D
		/*for(i=fin;i>=inicio;i--) {
			if(i%2==0) {
				System.out.print(i);
				System.out.print(" ");
				}
		}*/
		
		//punto2
		float ingresos = 489099;
		int vehiculos = 2;
		int inmuebles = 3;
		boolean economiaplena = true;
		
		if ( (ingresos >= 489083) && ( vehiculos >= 3) &&(inmuebles >= 3)&& (economiaplena==true)) {
		System.out.println("Categoria A");}
        if((ingresos >= 489083) || ( vehiculos >= 3) ||(inmuebles >= 3)|| (economiaplena==true)) {
		System.out.println("Categoria B");}
		if((ingresos < 489083) && ( vehiculos < 3) && (inmuebles <3) && (economiaplena!=true)) {
		System.out.println("Categoria C");}
		
		
		
		

	}

}