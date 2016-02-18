/**
 * digitos: Cuenta el número de dígitos de un número entero.
 *
 *
 *@albazw
 */
 
 
public class digitos{
  public static void main(String[] args){
    int numeroDeDigitos = 1, n, numeroIntroducido;

    
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroDeDigitos);

  }     
} 
