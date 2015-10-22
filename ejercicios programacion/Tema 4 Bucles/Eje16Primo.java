/**
 *Hacer un programa para ver si un numero es primo o no
 *
 *
 *@albazw
 */
 
 
 public class Eje16Primo{
   public static void main(String[] args){
   System.out.println("Dame un numero: ");
       int num=Integer.parseInt(System.console().readLine());
       int i=0;
       int cont=0;
    do{
      i++;
      if(num%i==0){
        cont++;
        }
		  
		  
        
       }while(i<num);
    if(num==1){   
       System.out.println("El numero no es primo");
    }else if(cont==2){
		 System.out.println("Es un numero primo");
	}else if(cont>2){
		 System.out.println("El numero no es primo");	 
		   
    }
     
     } 
     
     } 
