/**
 *Bucle do-while ejemplo
 *
 *
 *@albazw
 */
 
 
 public class TerminarCuandoEsImpar{
   public static void main(String[] args){
     int num;
     
     do{
       System.out.print("Dime un numero: ");
       num=Integer.parseInt(System.console().readLine());
       
       
       if(num%2==0){
         System.out.println("Que bonito es el "+num);
       }else{
         System.out.println("No me gusta los numero impares");
       }
     }while (num % 2==0);
     
     }
     
     }  
  
