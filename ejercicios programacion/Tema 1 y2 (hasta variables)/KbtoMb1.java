/**
 * 
 * 
 * 
 * 
 * Conversor de Kb a Mb
 * 
 * @author Albazw
  
  
  */
  
 public class KbtoMb1 {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Cuantas Kb?  ");
		 linea=System.console().readline();
		 int kb= Integer.parseint(linea);
		 
		
		 
		 
		 int mb=(1/1024)*kb;
		 
		 System.out.print ("Tiene estos Kb: " + mb);
		 
	 }
 }
