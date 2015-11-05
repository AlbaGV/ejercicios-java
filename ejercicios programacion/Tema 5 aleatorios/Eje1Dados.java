/**
 *Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 *total (los puntos que suman entre los tres dados).
 *
 *
 *@albazw
 */
 
 
 public class Eje1Dados{
   public static void main(String[] args){
	  int num=0;
	  int total=0;
	 

    System.out.println("Resultado de tres dados");
    
      for (int i = 1; i < 4; i++) {
		    num=(int)(Math.random()*6 +1);
        System.out.print(num + " ");
        total +=num;
     
      }
    System.out.println("Y el total es:"+total);
  }
}
