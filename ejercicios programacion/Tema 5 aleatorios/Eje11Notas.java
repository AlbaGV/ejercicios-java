/**
 *Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
 *la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
 *de suspensos, el número de suficientes, el número de bienes, etc.
 *
 *
 *@albazw
 */
 
 
 public class Eje11Notas{
   public static void main(String[] args){
	  int a=0;
	  int b=0;
	  int num=0;
	  int c=0;
	  int d=0;
	  int e=0;
	 

     System.out.println("Salen las siguientes notas: ");
     
     for(int i=0;i<20;i++){
    
		    num=(int)(Math.random()*11);
		   
		   if(num<5){
				System.out.println("Suspenso");
			  a++;
			}else if(num==5){
				b++;
				System.out.println("Suficiente");	 
			}else if(num==6){
				c++;
				System.out.println("Bien");
			}else if(num>6&&num<10){
				d++;
				System.out.println("Notable");
			}else if(num==10){
				e++;
				System.out.println("Sobresaliente");			
     
		  }
    }  
    System.out.println("Hay "+a+" suspensos,"+b+" suficientes,"+c+" bienes,"+d+" notables,y "+e+" sobresalientes"); 

		
 }
}
