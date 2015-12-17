/**
*Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
*determinado año y que muestre a continuación un diagrama de barras horizontales con
*esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
*carácter.
*
*@author albazw
*/
public class Eje8tiempo {
  public static void main(String[] args) {
    
    int[] num = new int[20];
    int u=0;
    
    num[0]=10;
		num[1]=15;
		num[2]=17;
		num[3]=20;
		num[4]=22;
		num[5]=25;
		num[6]=27;
		num[7]=33;
		num[8]=27;
		num[9]=22;
		num[10]=13;
		num[11]=11;
   
    System.out.println("La temperatura que ha hecho en cada mes ");
    System.out.println("Enero "+num[0]);
    System.out.println("Febrero "+num[1]);
    System.out.println("Marzo "+num[2]);
    System.out.println("Abril "+num[3]);
    System.out.println("Mayo "+num[4]);
    System.out.println("Junio "+num[5]);
    System.out.println("Julio "+num[6]);
    System.out.println("Agosto "+num[7]);
    System.out.println("Septiembre "+num[8]);
    System.out.println("Octubre "+num[9]);
    System.out.println("Noviembre "+num[10]);
    System.out.println("Diciembre "+num[11]);
    
    
		
		for(int i=0;i<12;i++){
			 System.out.println();
			for(u=0;u<num[i];u++){
				System.out.print("*");
			}
		}
		
	}
}
