/**
*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
*con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
*., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
*
* @albazw
*/
public class Eje10Linea {
  public static void main(String[] args) {

    int tr=0;
    
    int num=0;
    

    for(int cont=0;cont<10;cont++){
      
      num=(int)(Math.random()*6 +1);
      
      System.out.println(" ");
      
      tr=(int)(Math.random()*40 +1);
      
      for(int i=0;i<tr;i++){
        
        switch(num) {
         case 1:
           System.out.print("*");
         break;
         case 2:
           System.out.print("-");
         break;
         case 3:
           System.out.print("=");
         break;
         case 4:
           System.out.print(".");
         break;
         case 5:
           System.out.print("|");
         break;
         case 6:
           System.out.print("@");
         break;
        default:
     

        }
     
      }
    
    
    }
  }  
}
