/**
*Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
*los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
*1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
*posición 0. Finalmente, muestra el contenido del array.
*
*@author albazw
*/
public class Eje6cambio {
  public static void main(String[] args) {
    int[] num; 
    num = new int[15]; 
    
		
		System.out.println("Escribe 15 numeros: ");
		
		for(int i=0;i<15;i++){
			num[i]=Integer.parseInt( System.console().readLine() );
		}
		System.out.println("Los numeros cambiados son: ");
		for(int u=0;u<14;u++){
			System.out.println(num[u+1]);			
		}
		System.out.println(num[0]);
	}
}
