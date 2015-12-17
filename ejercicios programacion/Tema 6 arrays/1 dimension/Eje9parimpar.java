/**
*Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
*con la palabra “par” o “impar” según proceda.
*
*@author albazw
*/
public class Eje9parimpar {
  public static void main(String[] args) {
    int[] num; 
    num = new int[8];

    
     
    
		
		System.out.println("Escribe 8 numeros: ");
		
		for(int i=0;i<8;i++){
			num[i]=Integer.parseInt( System.console().readLine() );
		
		}
		
		System.out.println("Los numeros son: ");
		
		for(int i=0;i<8;i++){
			
			
			if(num[i]%2==0){
				System.out.println(num[i]+" par");
			}else if(num[i]%2!=0){
				System.out.println(num[i]+" impar");
			}			
		}		
	}
}
