/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.Controladora;
import Logica.Estudios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "SvEstudios", urlPatterns = {"/SvEstudios"})
public class SvEstudios extends HttpServlet {

     Controladora control = new Controladora();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    
        List<Estudios> listaEstudios = control.traerEstudios();
        
        HttpSession miSession =  request.getSession();
        miSession.setAttribute("listaEstudios",listaEstudios);
        
        response.sendRedirect("VerEstudios.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
          String primaria = request.getParameter("primaria");
        String secundaria = request.getParameter("secundaria");
        String universidad = request.getParameter("universidad");
        String actual = request.getParameter("actual");
        

        System.out.println("primaria: " + primaria);
         System.out.println("secundaria: " + secundaria);
          System.out.println("universidad: " + universidad);
           System.out.println("actual: " + actual);
           
           
                Estudios est = new Estudios(primaria, secundaria, universidad, actual);
            control.crearEstudios(est);
            response.sendRedirect("index.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
