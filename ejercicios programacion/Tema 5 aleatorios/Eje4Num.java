/**
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
*espacios.
*
* @albazw
*/
public class Eje4Num {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 0 y 10 (sin decimales):");

    for (int i = 1; i <= 20; i++) {
      System.out.print(((int)(Math.random()*11) ) + " ");
    }

  }
}
