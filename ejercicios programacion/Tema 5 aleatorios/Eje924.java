/**
*Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final
cuántos números se han generado.
*
* @albazw
*/
public class Eje924 {
  public static void main(String[] args) {

    int tr=0;
    int i=0;
    int num=0;

    while(num!=24){
      num=(int)(Math.random()*101);
     
      if(num%2==0){
        i++;
        System.out.println(num);
      }  
     
    }
    
    System.out.println("Hay "+i+" numeros");
  }
}
