/**
 * siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
 * como parámetro.
 *
 *
 *@albazw
 */
 
 
 public class siguientePrimo{
   public static void main(String[] args){
   
    int num=Integer.parseInt(System.console().readLine());
    int cont=0,cont2=0,pri=0;
    for(int i=num;i<pri;i++){
      cont++;
      while(i<pri){
        if(i%cont==0){
          cont2++;}
        if(cont2<=2){
          pri = i;
        }    
      }
    }
    System.out.print("Siguiente primo "+pri);
  } 
     
} 
