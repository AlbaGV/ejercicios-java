/**
 * 
 * 
 * 
 * 
 * Se pide dos numeros y multiplicas, sumas, divides y restas
 * 
 * @author Albazw
  
  
  */
  
 public class Calculator {
	 public static void (String[] args){
		 String linea;
		 
		 System.out.print ("Escribe el primer numero: ");
		 linea=System.console().readline();
		 int primernumero= Integer.parseint(linea);
		 
		 
		  System.out.print ("Escribe el segundo numero: " )
		  
		  linea=System.console().readline();
		 int segundonumero= Integer.parseint(linea);
		 
		 
		 double mul=primernumero*segundonumero;
		 System.out.println ("La multiplicacion sale: " + mul);
		 
		 double sum=primernumero+segundonumero;
		 System.out.println ("La suma sale: " + sum);
		 
		 double res=primernumero-segundonumero;
		 System.out.println ("La resta sale: " + res);
		 
		 double div=primernumero/segundonumero;
		 System.out.println ("La division sale: " + div);
		 
	 }
 }
		
		
