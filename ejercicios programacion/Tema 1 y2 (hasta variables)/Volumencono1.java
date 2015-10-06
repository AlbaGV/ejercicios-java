/**
 * 
 * 
 * 
 * 
 * Calcula el volumen de un cono v=pi*r²*h
 * 
 * @author Albazw
  
  
  */
  
 public class Volumencono1 {
	 public static void main (String[] args){
		 String linea;
		 
		 System.out.print ("Escribe el radio: ");
		 linea=System.console().readLine();
		 int radio= Integer.parseInt(linea);
		 
		 
		  System.out.print ("Escribe la altura: " );
		  
		  linea=System.console().readLine();
		 int altura= Integer.parseInt(linea);
		 
		 
		 double vol=3.14*(1/3)*radio*radio*altura;
		 
		 System.out.print ("El volumen sale: " + vol);
		 
	 }
 }
