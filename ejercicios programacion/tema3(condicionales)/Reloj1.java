/**
  *Reloj, entre 6 y 12 buenos dias,entre 13 y 20 buenas tardes,
  *entre 21 y 5 buenas noches
  *
  *@albazw
  
  */
  
  public class Reloj1 {
    public static void main (String[] args){
      System.out.print("Que hora es?: ");
       String linea=System.console().readLine();
       int hora;
       hora= Integer.parseInt(linea);
       
      
      
      if((hora>=6)&&(hora<=12)){
        System.out.println("Buenos dias");
        
        }else if((hora>=13)&&(hora<=20)){
          System.out.println("Buenas tardes");
        
        }else if((hora>=21)&&(hora<=24)&&(hora>=1)&&(hora<=5)){
          System.out.println("Buenas noches");
        
        
       
          
		}
		
	}
	
}
