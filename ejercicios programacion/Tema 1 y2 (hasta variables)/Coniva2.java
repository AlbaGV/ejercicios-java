/**
 * 
 * 
 * 
 * 
 * Calcula el iba
 * 
 * @author Albazw
  
  
  */
  
 public class Coniva2 {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Cual es el importe?  ");
		 linea=System.console().readline();
		 double inc= Integer.parseint(linea);
		 
		
		 
		 
		 double iva=inc+inc*0.21;
		 
		 System.out.print ("El coste total es: " + iva);
		 
	 }
 }
