/**
 *Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
 *tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
 *valor.
 *
 *
 *@albazw
 */
 
 
 public class Eje13Dados2{
   public static void main(String[] args){
	  int num=0;
	  int num2=0;
	 

    System.out.println("Tiramos dos dados ");
    
    do{
		    num=(int)(Math.random()*6 +1);
		    num2=(int)(Math.random()*6 +1);
        System.out.println(num+" y "+num2);
        if(num!=num2){
          System.out.println("No son iguales, volvemos a tirar");
        }else{
					System.out.println("Son iguales");
				}	
        
     
      }while(num!=num2);
    
  }
}
