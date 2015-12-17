/**
*Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
*según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
*del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
*
*@author albazw
*/
public class Eje212car {
  public static void main(String[] args) {
    
    String[] num = new String[10]; 
    num[0]="a";
		num[1]="x";
		num[2]=" ";
		num[3]=" ";
		num[4]="@";
		num[5]=" ";
		num[6]="' '";
		num[7]="+";
		num[8]=" ";
		num[9]="Q";
		
		
		System.out.println("Los valores del array n son los siguientes: ");
		System.out.print(num[0] + " | " + num[1] + " | " + num[2] + " | " + num[3] + " | " + num[4] + " | " + num[5] + " | " + num[6] + " | " + num[7] + " | " + num[8] + " | " + num[9]);
		
	}
}
