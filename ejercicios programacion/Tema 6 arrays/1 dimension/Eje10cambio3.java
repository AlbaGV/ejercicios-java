/**
*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
*almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
*primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
*restantes. Utiliza arrays auxiliares si es necesario.
* NO ESTA BIEN
*
*@author albazw
*/
public class Eje10cambio3 {
  public static void main(String[] args) {
    
    int[] num = new int[20];
    int[] num2 = new int[20];
    int u=0;
   
   
    
		
		for( int i=0;i<20;i++){//numeros aleatorios generados
			num[i]=(int)(Math.random()*101);
			System.out.println(num[i]);	
		}
		System.out.println("Los numeros pares son: ");
		for(int i=0;i<u;i++){//numeros pares
			if(num[i]%2==0){
				num2[i]=num[i];
				u++;
			  System.out.println(num2[i]);
			}  
		}
		System.out.println("Los numeros impares son: ");
		for(int i=u;i<20;i++){//impares
			if(num[i]%2!=0){
				num2[i]=num[i];
			  System.out.println(num2[i]);
			}  
		}		
	}
} 		
