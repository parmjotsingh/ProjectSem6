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
import modal.Course;
import modal.CourseDAO;
import modal.UserEnrolled;
import modal.UserEnrolledDAO;

/**
 *
 * @author Parmjot Singh chahal
 */
public class SaveUserAnsServlet extends HttpServlet {

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
            String userAns = request.getParameter("mcq");

            UserEnrolled ue = new UserEnrolled();
            HttpSession session = request.getSession();
            ue.setCourse((String) session.getAttribute("TestCourse"));
            ue.setUser((String) session.getAttribute("Username"));
            ue.setUserAnswer(Integer.parseInt(userAns));
//            System.out.println("=============================== "+(String)session.getAttribute("TestCourse") + (String)session.getAttribute("QusetionNumber"));
            ue.setqNo(Integer.parseInt((String) session.getAttribute("QusetionNumber")));

            UserEnrolledDAO ued = new UserEnrolledDAO();
            ued.addUserAns(ue);

            CourseDAO cd = new CourseDAO();
            Course c = cd.getCourseDetail((String) session.getAttribute("TestCourse"));
            if ((Integer.parseInt((String) session.getAttribute("QusetionNumber"))) >= c.getQues()) {
                session.setAttribute("QusetionNumber", (String) session.getAttribute("QusetionNumber"));
//               session.removeAttribute("TestCourse");
//               out.print("<script>alert('Your test is saved Successfully');</script>");
//               out.print("<script>window.location.href = 'MakeTest.jsp';</script>");
            } else {
                int i = Integer.parseInt((String) session.getAttribute("QusetionNumber")) + 1;
                System.out.println("++++++++++++++ " + i);
                session.setAttribute("QusetionNumber", "" + i);
            }
            request.getRequestDispatcher("TakeTest.jsp").forward(request, response);
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
