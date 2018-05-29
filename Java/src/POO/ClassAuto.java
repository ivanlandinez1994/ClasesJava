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
	
	public void setColor(String colorCoche)
	{
		color = colorCoche;
	}	
	public String getColor()
	{
		return "El color del auto es "+color;
	}	
	
	public void setAsientos(String asientosCuero)
	{
		if(asientosCuero.equalsIgnoreCase("si"))
			this.asientos_cuero=true;
		else
			this.asientos_cuero=false;	
	}
	public String getAsientos()
	{
		if(asientos_cuero)
			return "el coche tiene asientos de cuero";		
		else
			return "el coche tiene asientos de serie";
	}
	public void setClimatizador(String climatizador)
	{
		if(climatizador.equalsIgnoreCase("si"))
			this.Climatizador=true;
		else
			this.Climatizador=false;
	}
	public String getClimatizador()
	{
		if(Climatizador)
			return "el coche tiene climatizador";
		else
			return "el coche lleva aire acondicionado";
	}
	
	public String getPrecioCoche()
	{
		int precioTotal=10000;
		if(Climatizador==true)
			precioTotal+=500;
		if(asientos_cuero==true)
			precioTotal+=600;
		return "el precio total del coche es " + precioTotal;
	}
}

