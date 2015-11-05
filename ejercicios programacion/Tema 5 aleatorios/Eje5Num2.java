/**
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
*espacios. Muestra también el máximo, el mínimo y la media de esos números.
*
* @albazw
*/
public class Eje5Num2 {
  public static void main(String[] args) {
    System.out.println("50 números aleatorios entre 100 y 199 (sin decimales):");

    for (int i = 1; i <= 50; i++) {
      System.out.print(((int)(Math.random()*100 + 100 ) ) + " ");
    }

  }
}
