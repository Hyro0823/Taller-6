
public class Punto1 {
	
	public static void main(String[] arg) {
		int[] calificaciones = new int[9];
		
				
	calificaciones[0] = 8;
	calificaciones[1] = 9;
	calificaciones[2] = 5;
	calificaciones[3] = 7;
	calificaciones[4] = 1;
	calificaciones[5] = 4;
	calificaciones[6] = 7;
	calificaciones[7] = 3;
	calificaciones[8] = 9;

	System.out.print("los valores de las calificaciones son: ");
	
	for (int i=0; i<calificaciones.length; i++){
	    System.out.println(calificaciones[i]);
	}
}
}