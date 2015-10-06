/**
 * 
 * 
 * 
 * 
 * Conversor de euros a pesetas
 * 
 * @author Albazw
  
  
  */
  
 public class Europes {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Cuantos euros?  ");
		 linea=System.console().readline();
		 int euro= Integer.parseint(linea);
		 
		
		 
		 
		 int pes=166.386*euro;
		 
		 System.out.print ("Tiene estas pesetas: " + pes);
		 
	 }
 }
		
		
