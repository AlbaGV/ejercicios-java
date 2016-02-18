/**
 * potencia: Dada una base y un exponente devuelve la potencia.
 *
 *
 *@albazw
 */
 
 
 public class potencia{
   public static void main(String[] args){
    int base=Integer.parseInt(System.console().readLine());
    int exp=Integer.parseInt(System.console().readLine()); 
   
    
    double pot = 1;
        
    if (exp == 0) {
      pot = 1;
    }
    
    if (exp > 0) {
      for (int i = 0; i < exp; i++) {
        pot *= base;
      }
    }
    
    if (exp < 0) {
      for (int i = 0; i < -exp; i++) {
        pot *= base;
      }
      
      pot = 1/pot;
    }
    System.out.println(pot); 
  } 
     
} 
