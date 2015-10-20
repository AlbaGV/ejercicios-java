/**
 *Aceso a la caja fuerte, son 4 digitos y se tiene cuatro intentos
 *
 *
 *@albazw
 */
 
 
 public class Eje7cajafuerte{
   public static void main(String[] args){
    System.out.print("Dime un numero: ");
      int num=Integer.parseInt(System.console().readLine());
    
      
      int tr=4;
      
       while(num == 5555);{
		   
		   tr--;
		   
		   if(tr==0){
			   System.out.println("No tienes mas intentos");
			   
		   }else{   
			   
			  System.out.println("Es el numero incorrecto, te quedan: "+tr+" intentos, mete otro numero "); 
			    num=Integer.parseInt(System.console().readLine());
			   }
			   
		   }
			System.out.print("Es el numero correcto");   
		  
		  
     
     
     
     } 
 }
     
     
