package tercerproyectoTP4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Punto3 {

	public static void main(String[] args)throws IOException {
	String nombres;
	Path archivo;
	nombres =ingresaNombres();
	archivo=escribirArchivo(nombres);
	mostrarArch(archivo);
	
	

	}
   public static  String ingresaNombres() {
	   Scanner lista=new Scanner(System.in);
	   String linea;
	   System.out.println("ingrese 10 nombres separados por un espacio:");
		linea=lista.nextLine();
		return linea;
		  }
   
   public static Path escribirArchivo(String lista)throws IOException {
	   Path ruta = Paths.get("C:\\Users\\prile\\eclipse-workspace\\tercerproyectoTP4\\nombres.txt");
	   Files.write(ruta,lista.getBytes());
	   
	   return ruta;
   }
   public static void mostrarArch(Path camino)throws IOException {
	   List <String> contenidoArch=Files.readAllLines(camino,StandardCharsets.UTF_8);
	   System.out.println("mostrando el contenido del archivo:");
	   contenidoArch.forEach(line->System.out.print(line));
   }
}
