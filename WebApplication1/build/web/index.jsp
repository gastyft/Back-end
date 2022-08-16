<%--Comentarios --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Persona</title>
    </head>
    <body>
      
    <form  action="SvPersona" method="POST" >
        
        <label for="formGroupExampleInput" class="form-label">Nombre/s</label>
        <input type="text" class="form-control" name="nombre" placeholder="Ingrese Nombre/s"  >
   
        <label for="formGroupExampleInput2" class="form-label">Apellido</label>
        <input type="text" class="form-control" name="apellido" placeholder="Ingrese Apellido"   >
    
        <label for="formGroupExampleInput" class="form-label">Edad</label>
        <input type="text" class="form-control" name="edad" placeholder="Ingrese Edad"  ">
     
        <label  for="formGroupExampleInput2" class="form-label">Ciudad</label>
        <input  type="text" class="form-control" name="ciudad" placeholder="Ingrese ciudad de residencia"">
      
        <label for="formGroupExampleInput" class="form-label">Nacionalidad</label>
        <input type="text"  name="nacionalidad" placeholder="Ingrese Nacionalidad" ">
     
        <label for="formGroupExampleInput2" class="form-label">Estado civil</label>
        <input type="text" class="form-control" name="estado_civil" placeholder="Ingrese Estado civil" ">
   
        <button class="btn btn-primary" type="submit"  value="Guardar Cambios">enviar </button>
     
    
    </form>
        <form action="SvPersona" method="GET">
            <p>Si desea mostrar personas oprima el boton "mostrar personas"</p>
            <button type="submit" >Mostrar Personas</button>
            
        </form>
          <form action="SvEliminarPersona" method="POST">
            <p>Si desea eliminar oprima el boton "eliminar personas"</p>
            <p><label>Id:</label>  <input type="text" name="id_eliminar"> </p>
            <button type="submit" >Eliminar</button>
            
        </form>

    </body>
</html>
