/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author zombie_wolf
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
*Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
*Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
*almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
*deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
*contenido de los tres arrays dispuesto en tres columnas
*
*@author albazw
*/

    
    int[] num = new int[20];
    int[] cua = new int[20];
    int[] cub = new int[20]; 
    System.out.println("NUMERO | CUADRADO | CUBO");

		
		for(int i=0;i<20;i++){
			int ale=(int)(Math.random()*101);
			num[i]=ale;
			cua[i]=num[i]*num[i];
			cub[i]=num[i]*num[i]*num[i];
			System.out.println(num[i]+" | "+cua[i]+" | "+cub[i]);
		}
		
	}
}
    
    
