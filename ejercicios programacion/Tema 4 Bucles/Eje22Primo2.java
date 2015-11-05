/**
 *Hacer un programa para mostrar los numeros primos de 2 al 100
 *
 *
 *@albazw
 */
 
 
 public class Eje22Primo2{
   public static void main(String[] args){
       int num=1;
       int cont=0;
       int i=0;
		  
	 do{
      i++;
     
      if(num%i==0){
        cont++;
        }
	  
		System.out.println(cont);  
        
       }while(i<100);
		
			 
       
      
     
     
     
   } 
}
