/**
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 *2, 3, 4, 5, 6, 7, sota, caballo, rey y as. .
 *
 *
 *@albazw
 */
 
 
 public class Eje3Cartasñ{
   public static void main(String[] args){
	
	 

     System.out.println("Tenemos esta carta: ");
    
		int num=(int)(Math.random()*12 +1);
     
     switch(num) {
     case 1:
     System.out.print("AS");
     break;
     case 2:
    
     case 3:
   
     case 4:
   
     case 5:
     
     case 6:
     
     case 7:
     
     case 8:
     
     case 9:
     
      
     System.out.print(String.valueOf(num));
     break;
      case 10:
     System.out.print("Sota");
     break;
      case 11:
     System.out.print("Caballo");
     break;
      case 12:
     System.out.print("Rey");
     break;
    default:
}

     

		int tipo=(int)(Math.random()*4 +1);
  
     switch(tipo) {
     case 1:
     System.out.println(" de Bastos");
     break;
     case 2:
     System.out.println(" de Espadas");
     break;
     case 3:
     System.out.println(" de Oros");
      break;
     case 4:
     System.out.println(" de Copas");
      break;
      default:
     

                   }
 }
}
