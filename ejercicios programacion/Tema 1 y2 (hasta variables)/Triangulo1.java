/**
 * 
 * 
 * 
 * 
 * Calcula el area de un triangulo
 * 
 * @author Albazw
  
  
  */
  
 public class Triangulo1 {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Escribe la base: ");
		 linea=System.console().readline();
		 int base= Integer.parseint(linea);
		 
		 
		  System.out.print ("Escribe la altura: " )
		  
		  linea=System.console().readline();
		 int altura= Integer.parseint(linea);
		 
		 
		 double area=(base*altura)/2;
		 
		 System.out.print ("El area sale: " + area);
		 
	 }
 }
