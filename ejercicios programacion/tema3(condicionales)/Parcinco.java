/**
  *Escribe un programa que mire si un numero es par y/o multiplo de 5
  *
  *@albazw
  
  */
  
  public class Parcinco {
    public static void main (String[] args){
      System.out.print("Dime un numero: ");
       String linea=System.console().readLine();
         double a= Double.parseDouble(linea);
       
       
    
      
      if(a%2==0 && a%5==0){
      
       System.out.print("El numero es multiplo de 2 y de 5");
       
       }else if(a%2==0 && a%5!=0){
       
       System.out.print("El numero es par pero no multiplo de 5");
       
       }else if(a%2!=0 && a%5==0){
       
       System.out.print("El numero es multiplo de 5 pero no par");
       
       }else{
       
       System.out.print("El numero no es multiplo ni de 5 ni de 2");
       
       
       }
      
       
      
		
	}
	
}
