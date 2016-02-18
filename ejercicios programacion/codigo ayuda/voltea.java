/**
 * 
 * voltea: Le da la vuelta a un número.
 *
 * @albazw
 */
 
 
 public class voltea{
   public static void main(String[] args){
    
    int num=Integer.parseInt(System.console().readLine());
      
    int rev=0;
      
        
    do{
       rev=(rev*10)+(num%10);
       num=num/10;
       
      
       
    }while(num>0);
       
    System.out.print(rev);

    }

}
