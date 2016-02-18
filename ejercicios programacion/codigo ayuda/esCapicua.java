/**
* @author albazw
*
* esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
* y falso en caso contrario.
*/
public class esCapicua {
  public static void main(String[] args){
		int r,s=0,k;
	
		int n=Integer.parseInt(System.console().readLine());
		k=n;
		while(n !=0){
			
		  r=n%10;
		  s=s*10+r;
		  n=n/10;
		}
		
		if(s==k){
			
		  System.out.print("Es capicua");
		}else{
			System.out.print("No es capicua"); 
		}
	}
}			   
    
