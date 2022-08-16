

import Logica.Controladora;
import Logica.Persona;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;






@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {

    Controladora control = new Controladora();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Persona> listaPersonas = control.traerPersonas();
        
        HttpSession miSession =  request.getSession();
        miSession.setAttribute("listaPersonas",listaPersonas);
        
        response.sendRedirect("VerPersonas.jsp");
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
           
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String ciudad = request.getParameter("ciudad");
        String nacionalidad = request.getParameter("nacionalidad");
        String estado_civil = request.getParameter("estado_civil");
        
        System.out.println("nombre: " + nombre);
         System.out.println("apellido: " + apellido);
          System.out.println("edad: " + edad);
           System.out.println("ciudad: " + ciudad);
            System.out.println("nacionalidad: " + nacionalidad);
            
            
            
            Persona pers = new Persona(nombre, apellido, edad, ciudad, nacionalidad, estado_civil);
            control.crearPersona(pers);
            
            response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
