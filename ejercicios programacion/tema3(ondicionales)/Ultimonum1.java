/**
  *Escribe un numero de cinco digitos y di cual es el ultimo digito
  *
  *@albazw
  
  */
  
  public class Ultimonum1 {
    public static void main (String[] args){
      System.out.print("Dime un numero: ");
       String linea=System.console().readLine();
         int a= Integer.parseInt(linea);
       
       
    
      
      if(a>=10000 && a<=99999){
      
        
      
       System.out.print("La ultima cifra es: " + a%10);
       
     
       
       }else{
       
       System.out.print("El numero no es de cinco cifras");
       
       
       }
      
       
      
		
	}
	
}
