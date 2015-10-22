/**
 *Pide un intervalo que se tiene que validar, los numeros enteros dentro
 *del intervalo se les debe mostrar de 7 en 7
 *
 *
 *@albazw
 */
 
 
 public class Eje18De7en7{
   public static void main(String[] args){
     System.out.println("Dime el primer numero: ");
       int num1=Integer.parseInt(System.console().readLine());
     System.out.println("Dime el segundo numero: ");
       int num2=Integer.parseInt(System.console().readLine()); 
       
       while((num1>=num2)||((num2-num1)<7)){
         System.out.println("Intervalo incorrecto, prueba otra vez ");
         System.out.println("Dime el primer numero: ");
           num1=Integer.parseInt(System.console().readLine());
         System.out.println("Dime el segundo numero: ");
           num2=Integer.parseInt(System.console().readLine()); 
       }
       System.out.println(num1+1);
         
       for(int i=num1+1;i<num2;i++){
		   i +=6;
		   if(i<num2){
		   System.out.println(i); 
	   }
     }
     } 
     
     } 
