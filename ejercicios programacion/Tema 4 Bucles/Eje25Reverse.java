/**
 *Realiza un programa que pida un número por teclado y que luego muestre ese número al
 *revés.
 *
 *
 *@albazw
 */
 
 
 public class Eje25Reverse{
   public static void main(String[] args){
    System.out.print("Dime un numero : ");
     int num=Integer.parseInt(System.console().readLine());
      
       int rev=0;
      
        
    do{
       rev=(rev*10)+(num%10);
       num=num/10;
       
      
       
       } while(num>0);
       
	     System.out.print("Al reves es: "+rev);

		   
		    
	
		
			 
			 
			 
		 
		 
    }

}
