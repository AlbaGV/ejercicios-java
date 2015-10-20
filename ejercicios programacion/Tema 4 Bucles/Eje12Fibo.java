/**
 *Haz la susecion de fibonachi
 *
 *
 *@albazw
 */
 
 
 public class Eje12Fibo{
   public static void main(String[] args){
    System.out.print("Dime cuantos numeros quieres: ");
      int n=Integer.parseInt(System.console().readLine());
      int cont=2;
      int i=0;
      int i2=1;
      int iaux=0; 
       
     if(n==1){ 
       System.out.println("0"); 
     }else if(n==2){
       System.out.println("1"); 
     }else if(n>2){ 
		  System.out.println("0");
          System.out.println("1");   
     do{
      
     
      System.out.println(i+i2);
		  iaux=i2;
		  i2 +=i;
		  i=iaux;
		  
		cont++;
		  
		  }while(n>cont);
      
      }
  
       
       
       
       
   }
     
     
     
     }
