/**
  *Escribe un numero de cinco digitos y di cual es el ultimo digito
  *
  *@albazw
  
  */
  
  public class Cuentanum1 {
    public static void main (String[] args){
      System.out.print("Dime un numero: ");
       String linea=System.console().readLine();
         int a= Integer.parseInt(linea);
       
       
    
      
      if((a>=10000 && a<=99999)||(a<=-10000 && a>=99999)){
      
        System.out.print("El numero de cifras es 5");
       
      }else if((a>=1000 && a<=9999)||(a<=-1000 && a>=-9999)){
      
        System.out.print("El numero de cifras es 4");
        
      }else if((a>=100 && a<=999)||(a<=-100 && a>=-999)){
      
        System.out.print("El numero de cifras es 3"); 
        
      }else if((a>=10 && a<=99)||(a<=-10 && a>=-99)){
      
        System.out.print("El numero de cifras es 2");  
        
      }else if((a>=1 && a<=9)||(a<=-1 && a>=-9)){
      
        System.out.print("El numero de cifras es 1"); 
       
      
       }else{
       
       System.out.print("El numero es mayor que 5 es de cinco cifras");
       
       
       }
      
       
      
		
	}
	
}
