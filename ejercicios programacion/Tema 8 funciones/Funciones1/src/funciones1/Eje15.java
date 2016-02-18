/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones1;
import matematicas.Varias;
/**
 * Muestra los números primos que hay entre 1 y 1000.
 * @author zombie_wolf
 */
public class Eje15 {
  public static void main(String[] args){
   for(int i=0;i<=1000;i++){
    if (matematicas.Varias.esPrimo(i)) {
      System.out.print( i + " ");
    }
   } 
  }  
}
