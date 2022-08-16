
<%@page import="java.util.List"%>
<%@page import="Logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP VerPersonas</title>
    </head>
    <body>
        <h1>ListaPersonas</h1>
        
        <%  
            List <Persona> listaPersonas = (List) request.getSession().getAttribute("listaPersonas");
                
                
                for(Persona per: listaPersonas){
                
            
                
                %>
                <p> <b> nombre:</b> <%=per.getNombre() %> </p>
                 <p> <b> apellido:</b> <%=per.getApellido() %> </p>
                 <p> <b> Edad:</b> <%=per.getEdad() %> </p>
                 <p> <b> Nacionalidad:</b> <%=per.getNacionalidad() %> </p>
                  <p> <b> Estado civil:</b> <%=per.getEstado_civil()%> </p>
                   <p> <b> ciudad:</b> <%=per.getCiudad() %> </p>
             
                <p> ----------------------------------------------------------</p>
                   <%  } %>
    </body>
</html>
