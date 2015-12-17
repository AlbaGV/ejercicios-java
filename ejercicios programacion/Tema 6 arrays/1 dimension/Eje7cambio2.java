/**
*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
*por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
*y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
*la lista generada anteriormente. Los números que se han cambiado deben aparecer
*entrecomillados.
*
*@author albazw
*/
public class Eje7cambio2 {
  public static void main(String[] args) {
    int[] num; 
    num = new int[20]; 
    
		
		for(int i=0;i<20;i++){
			int ale=(int)(Math.random()*101);
			num[i]=ale;
		}
		System.out.println("Los numeros que salen son: ");
		for(int i=0;i<20;i++){
			System.out.print(num[i]+" ");			
		}
		System.out.println();
		System.out.println("¿Que numero quieres cambiar? ");
		int n1=Integer.parseInt( System.console().readLine() );
		System.out.println("¿y por cual? ");
		int n2=Integer.parseInt( System.console().readLine() );
		
		System.out.println("Los numeros cambiados  son: ");
		for(int i=0;i<20;i++){
			
			if(num[i]==n1){
				System.out.print("'"+n2+"' ");
			}else{
				System.out.print(num[i]+" ");	
			}					
		}
	}
}
