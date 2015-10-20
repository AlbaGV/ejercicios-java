/**
 *Escribe 10 numeros y ver quien es positivo y quien es negativo
 *
 *
 *@albazw
 */
 
 
 public class Eje13solysombra{
   public static void main(String[] args){
    System.out.print("Dime 10 numeros: ");
    int ip=0;
    int in=0;
    int i=0;
    int num=0;
    
        
    while(i<10){
    i++;
      num=Integer.parseInt(System.console().readLine());
		
	  if(num>=0){
	    ip++;
	    
	  }else if(num<0){
	    in++;
	      
	  
         } 
		
			
				  
      }
      
    System.out.print("Hay "+ip+" numeros positivos y "+in+" numeros negativos");  
  
       
     
  }
     
     
     
 }
