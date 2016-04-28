/**
  *Escribe tres numeros y ordenalos
  *
  *@albazw
  
  */
  
  public class Ordenarnumeros1 {
    public static void main (String[] args){
      System.out.print("Dime tres variables: ");
       String linea=System.console().readLine();
         double a= Double.parseDouble(linea);
       String linea2=System.console().readLine();
         double b= Double.parseDouble (linea2);
       String linea3=System.console().readLine();
         double c= Double.parseDouble (linea3);
       
      
      
     
      
      if(a>b && a>c && b>c){
        
     
        System.out.println("Ordenados son " + a + "," + b + ";" + c);
        
      }else if(a>b && a>c && b<c){
        
     
        System.out.println("Ordenados son " + a + "," + c + ";" + b); 
        
      }else if(a<b && a>c && b<c){
        
     
        System.out.println("Ordenados son " + b + "," + a + ";" + c);   
      
      }else if(a<b && a<c && b<c){
        
     
        System.out.println("Ordenados son " + b + "," + c + ";" + a);
        
      }else if(a>b && a<c && b<c){
        
     
        System.out.println("Ordenados son " + c + "," + a + ";" + b); 
        
      }else if(a<b && a<c && b<c){
        
     
        System.out.println("Ordenados son " + c + "," + b + ";" + a);  
        
      }   
     
        
       
        
       
      
		
	}
	
}
