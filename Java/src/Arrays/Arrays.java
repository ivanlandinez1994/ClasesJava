package Arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int [][]Array1=new int[4][5];
		
		/*for(int i=0; i<4; i++)
		{
			System.out.println(" ");
			for(int j=0; j<5; j++)
			{
				Array1[i][j]=i+j;
				System.out.print(Array1[i][j]+ " ");
			}
		}*/
		for(int[]fila:Array1)
		{
			System.out.println();
			for(int z: fila) {
				
				System.out.println(z+" ");
			}
		}
		

	}

}
