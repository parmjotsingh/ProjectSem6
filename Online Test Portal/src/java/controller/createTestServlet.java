/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.Course;
import modal.CourseDAO;

/**
 *
 * @author Parmjot Singh chahal
 */
public class createTestServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String course=request.getParameter("course").toUpperCase();
//            System.out.print("total ques"+request.getParameter("ques"));
            int ques=Integer.parseInt( request.getParameter("ques") );          
            Course ob = new Course();
            ob.setCourse(course);
            ob.setQues(ques);
            ob.setAuthor((String)request.getSession().getAttribute("Username"));
            CourseDAO obj=new CourseDAO();
            boolean result=obj.create(ob);
            System.out.println(result);
            String r= Boolean.toString(result);
            RequestDispatcher rd= request.getRequestDispatcher("MakeTest.jsp");
            if(result == false){
                out.print("<script>alert('This Course Already exists');</script>");
                out.print("<script>window.location.href = 'MakeTest.jsp';</script>");
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("CourseName", course);
                session.setAttribute("CreateQuestion", r);
                int n=1;
                session.setAttribute("QuestionNumber",n);
                rd.forward(request, response);
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
