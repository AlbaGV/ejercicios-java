/**
*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
*A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
*para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
*desplazando el resto de números (los que no son primos) de tal forma que no se pierda
*ninguno. Al final se debe mostrar el array resultante.
*
*@author albazw
*/
public class Eje11primo {
  public static void main(String[] args) {
    int[] num; 
    num = new int[10]; 
    
		
		System.out.println("introduce 10 numeros");
		
		for(int i=0;i<10;i++){
			num[i]=Integer.parseInt( System.console().readLine() );
		}
		
		System.out.println("indice      numero");
		
		for(int i=0;i<10;i++){
			System.out.println(i+"            "+num[i]);
		}
		System.out.println("Ahora separamos los primos ");
		for(int i=0;i<u;i++){
			
	}
}			
