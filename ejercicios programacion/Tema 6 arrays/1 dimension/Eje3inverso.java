/**
*Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
*inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
*
*@author albazw
*/
public class Eje3inverso {
  public static void main(String[] args) {
    int[] num; 
    num = new int[10]; 
    
		
		System.out.println("Escribe 10 numeros: ");
		
		for(int i=0;i<10;i++){
			num[i]=Integer.parseInt( System.console().readLine() );
		}
		System.out.println("Los numeros al reves son: ");
		for(int u=9;u>=0;u--){
			System.out.println(num[u]);	
		}
	}
}
