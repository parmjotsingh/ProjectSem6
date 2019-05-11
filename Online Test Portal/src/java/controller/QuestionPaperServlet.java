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
import modal.CourseDAO;
import modal.QuestionPaper;

/**
 *
 * @author Parmjot Singh chahal
 */
public class QuestionPaperServlet extends HttpServlet {

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
            String question=request.getParameter("question");
            String optn1=request.getParameter("optn1");
            String optn2=request.getParameter("optn2");
            String optn3=request.getParameter("optn3");
            String optn4=request.getParameter("optn4");
            String ans= request.getParameter("ans");
            HttpSession session = request.getSession();
            int qno=Integer.parseInt(session.getAttribute("QuestionNumber").toString());
            QuestionPaper obj=new QuestionPaper();
            obj.setCourse((String)request.getSession().getAttribute("CourseName"));
            obj.setQuestion(question);
            obj.setQuesNo(qno);
            obj.setOpt1(optn1);
            obj.setOpt2(optn2);
            obj.setOpt3(optn3);
            obj.setOpt4(optn4);
            obj.setAns(Integer.parseInt(ans));
            out.println(obj);
            CourseDAO ob=new CourseDAO();
            int q=ob.getTotalQuestion((String)request.getSession().getAttribute("CourseName"));
            if(qno == q){
                session.removeAttribute("QuestionNumber");
                session.removeAttribute("CourseName");
                session.removeAttribute("CreateQuestion");
                boolean flag=ob.addQuestions(obj);
                System.out.println(flag+"===========================flag");
                System.out.println("YES");
                out.print("<script>alert('ALL QUESTION SAVED SUCCESFULLY');</script>");
                out.print("<script>window.location.href = 'MakeTest.jsp';</script>");
            }
            else{
                qno=qno+1;            
                boolean flag=ob.addQuestions(obj);
                System.out.println(flag+"===========================");
                if(flag== true){
                session.setAttribute("QuestionNumber",qno);
                }
                response.sendRedirect("MakeTest.jsp");
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
