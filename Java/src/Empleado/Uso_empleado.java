package Empleado;

import javax.swing.JOptionPane;

public class Uso_empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1= new Empleado("ivan", 11500, 1994, 12, 14);
		Empleado empleado2= new Empleado("angelica", 12500, 1998, 07, 13);
		Empleado empleado3= new Empleado("diego", 13500, 2000, 06, 20);
		
		empleado1.setSubeSueldo(10);
		empleado2.setSubeSueldo(8);
		empleado3.setSubeSueldo(6);
		
		//persona1.setSubeSueldo(Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el aumento del empleado")));
		System.out.println(empleado1.getNombre()+"\n"+empleado1.getDate()+"\n"+empleado1.getSueldo());
		System.out.println(empleado2.getNombre()+"\n"+empleado2.getDate()+"\n"+empleado2.getSueldo());
		System.out.println(empleado3.getNombre()+"\n"+empleado3.getDate()+"\n"+empleado3.getSueldo());*/
		
		Empleado[] empleados =new Empleado[3];
		empleados[0]=new Empleado("ivan", 11500, 1994, 12, 14);
		empleados[1]=new Empleado("angelica", 12500, 1998, 07, 13);
		empleados[2]=new Empleado("diego", 13500, 2000, 06, 20);
		
		for(int i=0;i<empleados.length;i++)
		{
			empleados[i].setSubeSueldo(10);
		}
		
		for(Empleado e:empleados)
		{
			System.out.println(e.getNombre()+" "+e.getDate()+" "+e.getSueldo()+"\n");
		}
		
		

	}

}
