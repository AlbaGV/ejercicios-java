/**
*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
*intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
*ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
*estás pensando es mayor o menor que el que te acaba de decir.
*
* @albazw
*/
public class Eje14Game2 {
  public static void main(String[] args) {
    System.out.println("Piensa un numero del 0 al 100");
    
    int i=5;
    int num=(int)(Math.random()*101);
    String tr="";
    String mg="";
    
      
 
    while((tr.equals("si"))&&(i>0)){
			i--;
			if(i==4){
			System.out.println("Es el: "+num);
      tr=System.console().readLine();
		  
			}else{
				System.out.println("Es mayor o menor?" );
				mg=System.console().readLine();
				
			}		
        
      
      System.out.println("Te quedan: "+i+" intento(s)");
    }
    
    if(tr.equals("si")){
      System.out.println("YOU LOSE");
    }else{
    
      System.out.println("YOU WIN");
    }  
  }
}
