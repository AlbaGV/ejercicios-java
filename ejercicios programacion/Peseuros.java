/**
 * 
 * 
 * 
 * 
 * Conversor de euros a pesetas
 * 
 * @author Albazw
  
  
  */
  
 public class Peseuros {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Cuantas pesetas?  ");
		 linea=System.console().readline();
		 int pes= Integer.parseint(linea);
		 
		
		 
		 
		 int euro=(1/166.386)*pes;
		 
		 System.out.print ("Tiene estas pesetas: " + euro);
		 
	 }
 }
