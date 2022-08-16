<%-- 
    Document   : VerExperiencia
    Created on : 15-ago-2022, 18:53:20
    Author     : Usuario
--%>

<%@page import="Logica.Experiencia_laboral"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP VerExperiencia</title>
    </head>
    <body>  <h1>ListaExperiencia/h1>
            
        <%  
            List <Experiencia_laboral> listaExperiencia = (List) request.getSession().getAttribute("listaExperiencia");
                
                
                for(Experiencia_laboral exp: listaExperiencia){
                
            
                
                %>
                <p> <b></b> <%=exp.getExperiencia_laboral() %> </p>
                 <p>
             
                <p> ----------------------------------------------------------</p>
                   <%  } %>
    </body>
</html>
