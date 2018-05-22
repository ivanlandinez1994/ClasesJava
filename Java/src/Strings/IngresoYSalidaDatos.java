package Strings;
import java.util.*;


public class IngresoYSalidaDatos {
	public static void main(String args[]) {
		int edad;
		String nombre;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese su nombre: ");
		nombre=entrada.nextLine();
		System.out.println("ingrese su Edad: ");
		edad=entrada.nextInt();
		System.out.println("Su nombre es "+nombre + " Su edad es "+edad);
	}
}

