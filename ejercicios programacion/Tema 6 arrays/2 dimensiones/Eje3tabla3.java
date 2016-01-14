/**
* @author albazw
*
* Modifica el programa anterior de tal forma que los números que se introducen en el array
* se generen de forma aleatoria (valores entre 100 y 999)
*/
public class Eje3tabla3 {
  public static void main(String[] args){
    
    int[][] n = new int[5][6]; // array de 6 filas por 10 columnas
  
    int fila, columna=0,sumfila=0;
    

    for(fila = 0; fila < 5; fila++) {
			
      
      for(columna = 0; columna < 6; columna++) {
        n[fila][columna]=(int)(Math.random()*900)+100; 
      
      }   
    }  
    for(fila = 0; fila < 5; fila++) {
     
			for(columna = 0; columna < 6; columna++) {
				System.out.printf("%5d ",n[fila][columna]);
				sumfila +=n[fila][columna];
      }
    System.out.printf("|%5d\n",sumfila);  
    System.out.println();
    }
  }  
}
