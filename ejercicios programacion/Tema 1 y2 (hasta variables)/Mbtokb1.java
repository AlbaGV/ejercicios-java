/**
 * 
 * 
 * 
 * 
 * Conversor de Mb a Kb
 * 
 * @author Albazw
  
  
  */
  
 public class MbtoKb1 {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Cuantas Mb?  ");
		 linea=System.console().readline();
		 int mb= Integer.parseint(linea);
		 
		
		 
		 
		 int kb=1024*mb;
		 
		 System.out.print ("Tiene estos Kb: " + kb);
		 
	 }
 }
