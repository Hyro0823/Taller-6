
public class Punto2 {

	public static void main(String[] args) {
		float[][] precio = new float[10][3];
		
		precio[0][0] = 10.5f; 
		precio[0][1] = 20.0f; 
		precio[0][2] = 29.9f;
		System.out.print("los datos registrados son: ");
		
		for (int x=0; x < precio.length; x++) 
		 {
		    for (int y=0; y < precio[x].length; y++) 
		    {

		     System.out.print(" | ");System.out.print (precio[x][y]); System.out.print(" | ");

		    }
		  System.out.println();

		 }
	}

}
