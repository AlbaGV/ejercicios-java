/**
 *Escribe un programa que permita ir introduciendo una serie indeterminada de números
 *mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
 *total acumulado, el contador de los números introducidos y la media.
 *
 *
 *@albazw
 */
 
 
 public class Eje23Media3{
   public static void main(String[] args){
    System.out.print("Dime una serie de numeros : ");
       int num=0;
       int i=0;
       int total=0;
      
        
     while(total<=10000){
      num=Integer.parseInt(System.console().readLine());
        i++;
		
			total +=num;
	     }

		    System.out.print("Hay "+i+" numeros y la media es: "+(total/i)+" y la suma es: "+total);
		    
	
		
			 
			 
			 
		 
		 
    }

}
