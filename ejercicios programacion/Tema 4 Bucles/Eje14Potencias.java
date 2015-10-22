/**
 *Hacer un programa que pida una base y una potencia y hazla
 *
 *
 *@albazw
 */
 
 
 public class Eje14Potencias{
   public static void main(String[] args){
     System.out.println("Dame una base: ");
       int base=Integer.parseInt(System.console().readLine());
     System.out.println("Dime a que esta elevada: ");
       int pot=Integer.parseInt(System.console().readLine()); 
       int total=0;
         
       
          for(int i=0;i<=pot;i++){
			  
			   total *=base;
    
            
       }
       System.out.println("El resultado es: "+base);
     
     } 
     
     } 
