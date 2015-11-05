/**
 *Pide una altura y un caracter y haz una piramide
 *
 *
 *@albazw
 */
 
 
 public class Eje19Piramide{
   public static void main(String[] args){
     System.out.println("Dime la altura: ");
       int alt=Integer.parseInt(System.console().readLine());
     System.out.println("Dime el caracter: ");
       String car=System.console().readLine(); 
       
      
       
         
       for(int i=1;i<alt;i++){
		   car=car+car;
		   
		   System.out.println(car); 
	   
     }
     } 
     
     } 
