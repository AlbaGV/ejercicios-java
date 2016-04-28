/**
  *Haz una piramide y di hacia donde dirigila, ademas la piramide tiene que estar hecha 
  *del caracter que elijas
  *
  *@albazw
  
  */
  
  public class Piramide1 {
    public static void main (String[] args){
		
	System.out.println("Hacia donde esta la piramide? ");
	  String linea=System.console().readLine();
	
	System.out.println("Y de que caracter quieres que este hecha? ");
	  String car=System.console().readLine(); 
	   
	     
		
 
        
       
     if(linea.equals("arriba")){
     
     
     
      System.out.println("  "+car+" ");
      System.out.println(" "+car+" "+car);
      System.out.println(car+car+car+car+car);
     
       
       
       
     }else if(linea.equals("abajo")){
  
     
     
      System.out.println(car+car+car+car+car);
      System.out.println(" "+car+" "+car);
      System.out.println("  "+car+" ");
      
       
  
     
     }else if(linea.equals("derecha")){
     
     
      System.out.println(car);
      System.out.println(car+car);
      System.out.println(car+" "+car);
      System.out.println(car+car);
      System.out.println(car);
       
       
       
     }else if(linea.equals("izquierda")){
    
     
     
     
      System.out.println("  "+car);
      System.out.println(" "+car+car);
      System.out.println(car+" "+car);
      System.out.println(" "+car+car);
      System.out.println("  "+car);
      
       
   }else{
	   System.out.println("No es ninguna direcccion");
	   
   }
     
     
 }
 
}
