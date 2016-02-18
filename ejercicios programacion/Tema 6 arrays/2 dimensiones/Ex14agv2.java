/**
* @author albazw
*
* Realiza un programa que, a partir de un array de 4 filas por 6 columnas
* con números generados al azar entre 10 y 99, muestre a la derecha los
* mínimos de la fila y debajo los máximos de las columnas.
*/
public class Ex14agv2 {
  public static void main(String[] args){
    
    int[][] num = new int[4][6]; // array de 4 filas por 6 columnas

    int fila;
    int columna;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    
    // Introduce valores aleatorios en el array
    for(fila = 0; fila < 4; fila++) {
			
      for(columna = 0; columna < 6; columna++) {
        num[fila][columna] = (int)(Math.random() * 90) + 10;
        if (num[fila][columna] < min) {
          min = num[fila][columna];
          
        }
      }
    }

    // Muestra los datos y los minimos de las columnas
   
    for(fila = 0; fila < 4; fila++) {
      min=Integer.MAX_VALUE; 
      for(columna = 0; columna < 6; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        if (num[fila][columna] < min) {
          min = num[fila][columna];
          
        } 
       
      }  
      
      System.out.printf("|%7d\n", min);
      
    }
    
    // Muestra los maximos de las columnas
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    
    
    for(columna = 0; columna < 6; columna++) {
      max=Integer.MIN_VALUE;
      for(fila = 0; fila < 4; fila++) {
        if (num[fila][columna] > max) {
          max = num[fila][columna];
          
        }
      }

      
      System.out.printf("%7d   ", max);
      
    }
   
  }
}
