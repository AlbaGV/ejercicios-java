/**
 * 
 * 
 * 
 * 
 * Calcula salario, gana 12 euros por hora(las primeras 40) luego gana 
 * 16 por cada hora
 * 
 * @author Albazw
  
  
  */
  
 public class Salario2 {
	 public static void main (String[] args){
		 String linea;
		 
		 System.out.print ("Cuantas horas trabaja?  ");
		 linea=System.console().readLine();
		 int horas= Integer.parseInt(linea);
		 int euro = 0;
		
		 if((horas>1)&&(horas<=40)){
		 
		  euro=12*horas;
		 
		 }else if(horas>=41) {
		 
		 euro=16*horas;
		 
		 
	 }
	 
	 
	 System.out.println("Su salario es: " + euro);
 }
 
 }
