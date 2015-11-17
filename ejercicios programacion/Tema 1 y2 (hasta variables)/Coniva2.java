/**
 *Escribe un programa que calcule el precio final de un producto según su base imponible (precio
 *antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
 *promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4%
 *respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o
 *se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los
 *números no estén tabulados. 
 * 
 * 
 * 
 *
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
