/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones1;

/**
 * Escribe un programa que pase de binario a decimal.
 * @author zombie_wolf
 */
import matematicas.Varias;
public class Eje17 {
    public static void main(String[] args){
      long decimal = 0;
    
      System.out.print("Introduzca un número : ");
      long binario = Long.parseLong(System.console().readLine());
    
      int bits = matematicas.Varias.digitos(binario);
    
      for(int i = 0; i < bits; i++) {
        decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
      }
    
      System.out.println(binario + " en binario es " + decimal + " en decimal.");
       
      }
    
}
