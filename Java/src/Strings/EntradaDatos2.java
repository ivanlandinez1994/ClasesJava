package Strings;
import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		String nombre, apellido;
		int edad;
		int dni;
		
		nombre=JOptionPane.showInputDialog("ingrese su nombre");
		apellido=JOptionPane.showInputDialog("ingrese su apellido");
		edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
		dni=Integer.parseInt(JOptionPane.showInputDialog("ingrese su dni sin puntos"));
		System.out.println("Nombre "+nombre+"\nApellido"+apellido+ "\nEdad: "+edad+"\nDni: "+dni);
		JOptionPane.showMessageDialog(null,"Nombre "+nombre+"\nApellido "+apellido+ "\nEdad: "+edad+"\nDni: "+dni);

	}

}
