/**
 *Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 *negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
 *de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
 *datos pero no se incluye en el cómputo.
 *
 *
 *@albazw
 */
 
 
 public class Eje21Media2{
   public static void main(String[] args){
    System.out.print("Dime una serie de numeros que termine en negativo: ");
       int num=0;
       int i=0;
       int totalimp=0;
       int nummayor=0;
       int imp=0;
        
     while(num>=0){
      num=Integer.parseInt(System.console().readLine());
		if(num>=0){
			i++;
			
			if(num%2==0){
	          if(num > nummayor){
				  
				  nummayor = num;
			  }
	    
	        }else{
	         imp++;
	         totalimp +=num;
		 }
		 }else {}
	     }

		    System.out.print("Hay "+i+" numeros y la media de los impares es: "+(totalimp/imp)+" y el mayor de los pares es: "+nummayor);
		    
	
		
			 
			 
			 
		 
		 
    }

}
