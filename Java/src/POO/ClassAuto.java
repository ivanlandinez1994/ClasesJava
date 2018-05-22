package POO;

public class ClassAuto {
	private int ruedas, ancho, largo, motor, peso;
	String color;
	int peso_total;
	boolean asientos_cuero, Climatizador;

	public ClassAuto()
	{
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	
	public String getLargo()
	{
		return "el largo del auto es: "+largo;
	}
	
	public void setColor()
	{
		color="verde";
	}	
	public String getColor()
	{
		return "El color del auto es "+color;
	}	
	
}

