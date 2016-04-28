

/**
 * Muestra los números primos que hay entre 1 y 1000.
 * @author zombie_wolf
 */
public class Prueba {
  public static void main(String[] args){
   for(int i=0;i<=1000;i++){
    if (esPrimo(i)) {
      System.out.print( i + " ");
    }
   } 
  } 
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
}

