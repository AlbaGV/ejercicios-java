<%-- 
    Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los primos deberán
aparecer en un color diferente al resto.
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 15</title>
    </head>
    <body>
        <%  
            int num=0,cont=0,i=0;
            for(int f=0;f<100;f++){
      
               num=(int)(Math.random()*199 +1);
               do{
                 i++;
                 if(num%i==0){
                   cont++;
                 }
	       }while(i<num);
               if(num==1){   
                 System.out.print(num+" ");
               }else if(cont==2){
                   
        
        
		 System.out.print("<span class=\"verde\">" + num + "</span> ");
       
               }else if(cont>2){
		 System.out.print(num+" ");	 
	       }
        %>       
    </body>
</html>
