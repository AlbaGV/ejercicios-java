/**
* @author albazw
*
* Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
* un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
* columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
* esquina inferior derecha.
*/
public class Eje2tabla2 {
  public static void main(String[] args){
    
    int[][] n = new int[5][6]; // array de 3 filas por 6 columnas
    
    int fila, columna=0;
    System.out.println("Escribe los numeros"); 
    
    for(fila = 0; fila < 4; fila++) {
      n[fila][columna]=Integer.parseInt( System.console().readLine() );
      for(columna = 0; columna < 5; columna++) {
        n[fila][columna]=Integer.parseInt( System.console().readLine() ); 
      
      }
      System.out.println("Fin Columna: "+fila); 
      
    }
			for(fila = 0; fila < 4; fila++) {
				System.out.printf("%10d","Columna: "+fila); 
				for(columna = 0; columna < 5; columna++) {
					System.out.printf("%10d ", n[fila][columna]);
				
				}
        
      }
  }  
}
