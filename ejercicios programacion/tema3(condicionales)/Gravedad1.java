/**
  *Calcula velocidad de caida a partir de la siguiente formula 
  *t=(2*h/g)^(1/2)
  *
  *@albazw
  
  */
  
  public class Gravedad1 {
    public static void main (String[] args){
      System.out.print("A que altura esta: ");
       String linea=System.console().readLine();
       
      double altura= Double.parseDouble(linea);
       
      
      
      if(altura<0){
        System.out.println("No es posible");
        
        }else {
          
          double tiempo=Math.sqrt(2*altura/9.8);
          
          System.out.println ("El tiempo que tarda es:" + tiempo);
          
          }
        
       
      
		
	}
	
}
