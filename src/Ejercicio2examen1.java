import java.util.Scanner;


public class Ejercicio2examen1 {

	public static void main(String[] args) {
		
		 Scanner X = new Scanner(System.in);  
		 //Este Programa lo que use para realizarlo es un while, asi de esta forma compara el texto y la va repitir
		 // n cantidad de veces con la variable numero que esta es la que define cuantas veces se repetira.
		System.out.print("Ingrese un numero: ");
		 int num=0; 
	        num=X.nextInt(); 
	        System.out.println("Ingrese el texto que quiere que se repita "+ (num) + (" veces:"));
	    	String texto = X.next();
	    	int Y=0;
	    	while (Y<=num)
	    	{
	    		System.out.println(texto);
	    		Y+=1;
	    	}
		
	}

}
