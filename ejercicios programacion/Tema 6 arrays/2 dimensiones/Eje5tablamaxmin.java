/**
* @author albazw
*
* Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
* positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
* deberá dar la posición tanto del máximo como del mínimo.
*/
public class Eje5tablamaxmin {
  public static void main(String[] args){
    
    int[][] n = new int[7][11]; // array de 6 filas por 10 columnas
   
    int fila, columna=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,maxfi=0,maxco=0,minfi=0,minco=0;
    

    for(fila = 0; fila < 6; fila++) {
			
      
      for(columna = 0; columna < 10; columna++) {
        n[fila][columna]=(int)(Math.random()*1001); 
        if(n[fila][columna]>max){
			    n[fila][columna]=max;
				  maxfi = fila;
				  maxco = columna;
				
			  }
			
			  if(n[fila][columna]<min){
			    n[fila][columna]=min;
          minfi = fila;
          minco = columna;
			  }
      }
     
    }  
    for(fila = 0; fila < 6; fila++) {
     
			for(columna = 0; columna < 10; columna++) {
				System.out.printf("%5d ",n[fila][columna]);
      
      } 
    System.out.println();
    }
   System.out.println("La posicion del maximo es: ("+maxfi+","+maxco+") y la posicion del minimo es: ("+minfi+","+minco+")"); 
  }  
}
