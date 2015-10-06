/**
 * 
 * 
 * 
 * 
 * Calcula salario, gana 12 euros por hora
 * 
 * @author Albazw
  
  
  */
  
 public class Salario1 {
	 public static void main (String[] args){
		 String linea;
		 
		 System.out.print ("Cuantas horas trabaja?  ");
		 linea=System.console().readLine();
		 int horas= Integer.parseInt(linea);
		 
		
		 
		 
		 int euro=12*horas;
		 
		 System.out.print ("su salario es: " + euro);
		 
	 }
 }
