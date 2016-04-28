/**
  *Realiza un programa que calcule tres notas, (0,5) insuficiente,(5,6) sufiente,
  *(6,7)bien,(7,9)notable,(9,10) sobresaliente
  *
  *@albazw
  
  */
  
  public class Notas1 {
    public static void main (String[] args){
      System.out.print("Cuales son tus notas: ");
       String linea=System.console().readLine();
       
          double nota1= Double.parseDouble (linea);
       
       String linea2=System.console().readLine();
       
          double nota2= Double.parseDouble (linea2);
       
       String linea3=System.console().readLine();
       
          double nota3= Double.parseDouble (linea3);
         
       double media=(nota1+nota2+nota3)/3;
       
       System.out.println("Tu nota media es: " + media);
       
       
      
      
      if(media<5){
        System.out.println("Tienes un insuficiente");
        
        }else if((media>=5)&&(media<6)){
          System.out.println("Tienes un suficente");
        
        }else if((media>=6)&&(media<7)){
          System.out.println("Tienes un bien");
          
        }else if((media>=7)&&(media<9)){
          System.out.println("Tienes un notable");  
        
        }else if((media>=9)&&(media<=10)){
          System.out.println("Tienes un sobresaliente");
        
       
          
		}
		
	}
	
}
