/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones1;
import matematicas.Varias;
/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 * @author zombie_wolf
 */

public class Eje16 {
    public static void main(String[] args){
      for(int i=10;i<10000;i++){
        if (matematicas.Varias.esCapicua(i)) {
          System.out.print( i + " ");
        }
      }
    }
}
