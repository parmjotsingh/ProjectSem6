/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Student;
import model.StudentDAO;

/**
 *
 * @author Parmjot Singh chahal
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String uname= request.getParameter("uname");
           String pass = request.getParameter("pass");
           String type = uname.substring(0, 2);
           int id= Integer.parseInt(uname.substring(2));
           
           Student s= new Student();
           s.setId(id);
           s.setPwd(pass);
           s.setType(type);
           StudentDAO ud= new StudentDAO();
           
           String name=ud.check(s);
           if(name != null){
//               out.println("true");
               HttpSession session=request.getSession();
               session.setAttribute("un",name);
               session.setAttribute("type",type);
               System.out.println(" ======================== here============type = "+type+"   "+type.equalsIgnoreCase("st"));
               if( type.equalsIgnoreCase("st") || type.equalsIgnoreCase("sf") ){
//                   System.out.println("================================HI 1");
                    response.sendRedirect("Home.jsp");
               }
               else{
                   System.out.println("================================HI 2");
                   response.sendRedirect("admin.jsp");
               }
           }
           else{
//               System.out.println("========================================false");
               response.sendRedirect("newLogin.html");
           }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
