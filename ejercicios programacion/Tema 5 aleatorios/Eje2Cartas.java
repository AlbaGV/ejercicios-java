/**
 *Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
 *baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
 *formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
 *9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
 *podemos usar String.valueOf(n) .
 *
 *
 *@albazw
 */
 
 
 public class Eje2Cartas{
   public static void main(String[] args){
	
	 

     System.out.println("Tenemos esta carta: ");
    
		int num=(int)(Math.random()*13 +1);
     
     switch(num) {
       case 1:
       System.out.print("AS");
       break;
       case 2:
      
       case 3:
     
       case 4:
     
       case 5:
       
       case 6:
       
       case 7:
     
       case 8:
    
       case 9:
    
       case 10:
        System.out.print(String.valueOf(num));
       break;
       case 11:
        System.out.print("J");
       break;
       case 12:
        System.out.print("Q");
       break;
       case 13:
        System.out.print("K");
      break;
    default:
    }

     

		int tipo=(int)(Math.random()*4 +1);
  
      switch(tipo) {
         case 1:
           System.out.println(" de Picas");
         break;
         case 2:
           System.out.println(" de Corazones");
         break;
         case 3:
           System.out.println(" de Diamantes");
         break;
         case 4:
           System.out.println(" de Treboles");
         break;
      default:
     

      }
 }
}
