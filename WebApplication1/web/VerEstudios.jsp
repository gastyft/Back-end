<%-- 
    Document   : VerEstudios
    Created on : 15-ago-2022, 18:58:27
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Estudios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP VerEstudios</title>
    </head>
    <body>
         <h1>ListaPersonas</h1>
        
        <%  
            List <Estudios> listaEstudios = (List) request.getSession().getAttribute("listaEstudios");
                
                
                for(Estudios est: listaEstudios){
                
            
                
                %>
                <p> <b> primaria:</b> <%=est.getPrimaria() %> </p>
                 <p> <b> secundaria:</b> <%=est.getSecundaria() %> </p>
                 <p> <b> Universidad:</b> <%=est.getUniversidad() %> </p>
                 <p> <b> actual:</b> <%=est.getActual() %> </p>
               
             
                <p> ----------------------------------------------------------</p>
                   <%  } %>
    </body>
</html>
