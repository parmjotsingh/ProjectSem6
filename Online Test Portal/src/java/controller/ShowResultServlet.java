/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.CourseDAO;
import modal.QuestionPaper;
import modal.UserEnrolled;
import modal.UserEnrolledDAO;

/**
 *
 * @author Parmjot Singh chahal
 */
public class ShowResultServlet extends HttpServlet {

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
            String course = request.getParameter("button");

            CourseDAO cd = new CourseDAO();
            List<QuestionPaper> l = cd.getQuestionPaper(course);

            UserEnrolledDAO ud = new UserEnrolledDAO();
            List<UserEnrolled> l2 = ud.getCourseResult(course);

//            for(UserEnrolled j:l2){out.println("<h1>"+j.getUser()+" ans : "+j.getUserAnswer()+"</h1>");}
            Iterator itr = l2.iterator();
            String user = null;
            
            Set<String> set= new HashSet<>();
            while (itr.hasNext()) {
                String us = ((UserEnrolled) itr.next()).getUser();
//                out.println(us);
                if (!us.equals(user)) {
                    
                    int score = 0, totalScore = 0;
                    for (UserEnrolled j : l2) {
                        user = j.getUser();
                        for (QuestionPaper i : l) {
                            if (i.getQuesNo() == j.getqNo() && us.equals(user)) {
                                totalScore++;
                                if (i.getAns() == j.getUserAnswer()) {
                                    score++;
                                }
                            }
                        }
                    }
                    set.add(""+ us + " : " + score + " / " + totalScore);
                }
                user=null;
            }
            
//            Iterator it= set.iterator();
//            int c=0;
//            while(it.hasNext()){
//                c++;
//                out.println("<h1>"+c+") "+it.next()+"</h1>");
//            }
            request.setAttribute("set", set);
            request.getRequestDispatcher("Result.jsp").forward(request, response);
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
