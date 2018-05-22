package Arrays;

public class Arrays2D {

	public static void main(String[] args) {
		
		double acumulado;
		double interes=1.1;
		double [][ ]Saldo=new double [6][5];
		
		for(int i=0; i<6; i++)
		{
			Saldo[i][0]=10000;
			acumulado=10000;
			for(int j=1;j<5;j++)
			{
				acumulado=acumulado*interes;
				Saldo[i][j]=acumulado;				
			}
			interes=interes+0.01;
		}
		
		for(int i=0; i<6; i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
			{
				System.out.printf("%1.2f",Saldo[i][j]);		
				System.out.print(" ");
			}
			interes=interes+0.01;
		}
		
	}

}
