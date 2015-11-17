/**
*Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
*que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
*sucede con los valores de los elementos que no han sido inicializados?
*
*@author albazw
*/
public class Eje112num {
  public static void main(String[] args) {
    int[] num; 
    num = new int[12]; 
    num[0]=39;
		num[1]=-2;
		num[2]=0;
		num[3]=0;
		num[4]=0;
		num[5]=0;
		num[6]=14;
		num[7]=0;
		num[8]=5;
		num[9]=120;
		num[10]=0;
		num[11]=0;
		
		System.out.println("Los valores del array n son los siguientes: ");
		System.out.print(num[0] + " | " + num[1] + " | " + num[2] + " | " + num[3] + " | " + num[4] + " | " + num[5] + " | " + num[6] + " | " + num[7] + " | " + num[8] + " | " + num[9] + " | " + num[10] + " | " + num[11]);
		
	}
}
