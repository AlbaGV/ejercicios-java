/**
 * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y
 * falso en caso contrario.
 *
 *
 *@albazw
 */
 
 
 public class esPrimo{
   public static void main(String[] args){
   
    int num=Integer.parseInt(System.console().readLine());
    int i=0;
    int cont=0;
    do{
      i++;
      if(num%i==0){
        cont++;
      }
		  
		  
        
    }while(i<num);
    if(num==1){   
      System.out.println("El numero no es primo");
    }else if(cont==2){
      System.out.println("Es un numero primo");
	  }else if(cont>2){
		  System.out.println("El numero no es primo");	 
		   
    }
     
  } 
     
} 
