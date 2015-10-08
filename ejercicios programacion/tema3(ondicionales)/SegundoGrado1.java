/**
  *Calcula una ecuacion de segundo grado
  *
  *@albazw
  
  */
  
  public class SegundoGrado1 {
    public static void main (String[] args){
      System.out.print("Dime tres variables: ");
       String linea=System.console().readLine();
         double a= Double.parseDouble(linea);
       String linea2=System.console().readLine();
         double b= Double.parseDouble (linea2);
       String linea3=System.console().readLine();
         double c= Double.parseDouble (linea3);
       
      double inside= b*b-4*a*c;
      
      if(a==0){
        double sol=-c/b;
      
        System.out.println("La solucion es: " + sol);
        
        }else if(inside<0) {
          System.out.println("El resultado no es posible");
          
        }else if(inside==0){
          double sol1= -b/(2*a);
          
           System.out.println ("La solucion da: " + sol1);
         
        }else if(inside>0){
           
           double sol2=(Math.sqrt(inside)-b)/(2*a);
           double sol3=(-Math.sqrt(inside)-b)/(2*a);
          
          System.out.println ("Las soluciones son: " + sol2 + " y " + sol3);
          
        }else if((a==0)&&(b==0)) {
          System.out.println("El resultado no es posible");
          
	  }
        
       
      
		
	}
	
}
