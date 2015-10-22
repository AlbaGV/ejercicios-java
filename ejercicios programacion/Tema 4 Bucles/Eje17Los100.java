/**
 *Haz un programa que sume los 100 numeros siguientes al que tu pongas
 *se debe comprobar si es positivo o no
 *
 *
 *@albazw
 */
 
 
 public class Eje17Los100{
   public static void main(String[] args){
    System.out.print("Dime un numero: ");
       int num=0;
       int total=0;
       
       
       
    do{
      num=Integer.parseInt(System.console().readLine());
	
		 }while(num<0);
		 
	for(int i=num+1;i<(num+101);i++){
	   total +=i;
   }
      System.out.println("Da: "+total);
      
    }
     
     
     
  }
