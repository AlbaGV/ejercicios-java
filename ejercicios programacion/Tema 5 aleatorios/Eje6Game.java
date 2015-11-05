/**
*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
*y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
*oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
*
* @albazw
*/
public class Eje6Game {
  public static void main(String[] args) {
    System.out.println("Dime un numero: ");
    int tr=0;
    int i=5;
    int num=(int)(Math.random()*101);
    while(i>0){
      i--;

      tr=Integer.parseInt(System.console().readLine());
 
      if(tr==num){
        System.out.println("YOU WIN era el "+num);
      }else if(tr>num){
        System.out.println("El numero es menor"); 
      }else if(tr<num){
        System.out.println("El numero es mayor");
      }	
 
       System.out.println("Te quedan: "+i+" intento(s)");


    }
    System.out.println("GAME OVER");
  }
}
