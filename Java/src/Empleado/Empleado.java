package Empleado;
import java.util.*;

public class Empleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia)
	{
		this.nombre=nombre;
		this.sueldo=sueldo;
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	
	/*public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}*/
	public String getNombre()
	{
		return "Nomnre: " + nombre;
	}
	public String getSueldo()
	{
		return "Sueldo: " + sueldo;
	}
	public String getDate()
	{
		return "Fecha ingreso: " + altaContrato;
	}
	public void setSubeSueldo(double porcentaje)
	{
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}	
}

