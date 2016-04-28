/**
  *Pide la hora y los minutos y calcula lo que falta en segundoos para la medianoche
  *
  *@albazw
  
  */
  
  public class Relog {
    public static void main (String[] args){
      System.out.print("Dime primero la hora y despues los minutos: ");
       String linea=System.console().readLine();
         double hora= Double.parseDouble(linea);
       String linea2=System.console().readLine();
         double min= Double.parseDouble (linea2);
       
       
      double seghora=hora*3600 ;
      double segmin=min*60;
      
      double totseg=86400-seghora-segmin;
      
      
      
      
      if((totseg>=0)&&(hora>=0 && hora<=24)&&(min>=0 && min<=60)){
        
      
        System.out.println("Los segundos que faltan son: " + totseg);
        
       
        
      }else{
        
        System.out.println("Los datos no son correctos");
        
        }
        
      }
        
    }  
