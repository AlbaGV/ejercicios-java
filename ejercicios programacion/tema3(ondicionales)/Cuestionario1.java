/**
  *Haz un cuestionario de 10 preguntas y pon una puna puntuacion final
  *
  *@albazw
  
  */
  
  public class Cuestionario1 {
    public static void main (String[] args){
		
		int con=0;
		
      System.out.println("1º¿Pluton es un planeta?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea=System.console().readLine();
        
       
     if(linea.equals("2")){
     con++;}
     
     
      System.out.println("2º¿La materia oscura existe?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea2=System.console().readLine();
       
       
       
     if(linea2.equals("1")){
     con++;}
     
     
      System.out.println("3º¿La energia nuclear es mala?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea3=System.console().readLine();
       
       
     if(linea3.equals("2")){
     con++;}
     
     
     
      System.out.println("4º¿La ciencia es genial?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea4=System.console().readLine();
       
       
     if(linea4.equals("1")){
     con++;}
     
     
     
      System.out.println("5º¿Vamos a aprobar todos?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea5=System.console().readLine();
       
       
     if(linea5.equals("1")){
     con++;}
     
     
     
      System.out.println("6º¿El pan engorda?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea6=System.console().readLine();
       
       
     if(linea6.equals("1")){
     con++;}
     
     
     
      System.out.println("7º¿La ingenieria es dificil?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea7=System.console().readLine();
   
       
     if(linea7.equals("1")){
     con++;}
     
     
     
      System.out.println("8º¿En España hay muchas energia renovables?");
      System.out.println("1-SI");
      System.out.println("2-NO");
       String linea8=System.console().readLine();
   
       
     if(linea8.equals("1")){
     con++;}
     
     
     
      System.out.println("9º¿Que lenguaje utilizamos ahora?");
      System.out.println("1-Java");
      System.out.println("2-HTML");
       String linea9=System.console().readLine();
      
       
     if(linea9.equals("1")){
     con++;}
     
     
     
      System.out.println("10º¿Y en lenguaje de marca?");
      System.out.println("1-Basic");
      System.out.println("2-HTML");
       String linea10=System.console().readLine();
     
       
     if(linea10.equals("2")){
     con++;}
     
     
     
     System.out.println("Tu puntuacion es: " + con);
     
     
 }
 
}
     
     
     
     
       
         
   
