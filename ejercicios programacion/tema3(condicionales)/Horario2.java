/**
  *Depende de un numero del uno al 7 da un dia de la semana
  *
  *@albazw
  
  */
  
  public class Horario2 {
    public static void main (String[] args){
      System.out.print("Que numero  es: ");
      String dia=System.console().readLine();
      
      
      if(dia.equals("1")){
        System.out.println("Lunes");
        
        }else if(dia.equals("2")){
          System.out.println("Martes");
        
        }else if(dia.equals("3")){
          System.out.println("Miercoles");
        
        }else if(dia.equals("4")){
          System.out.println("Jueves");
        
        }else if(dia.equals("5")){
          System.out.println("Viernes");
        
        }else if(dia.equals("6")){
          System.out.println("Sabado");
         
          
        }else if(dia.equals("7")){
          System.out.println("Domingo");
          
          
        }else {
        
          System.out.println("No es ningun dia");
          
		}
		
	}
	
	
	}
          
