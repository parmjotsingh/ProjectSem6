/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.fordriver;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.BusRoute;
import model.BusRouteDAO;

/**
 *
 * @author Parmjot Singh chahal
 */
public class AddDriverServlet extends HttpServlet {

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
            String route = request.getParameter("route");
            String driver = request.getParameter("driver");
            String contact = request.getParameter("contact");
            String busno = request.getParameter("busno").toUpperCase();
            String place = request.getParameter("place").toUpperCase();

            BusRoute bd = new BusRoute();
            bd.setBusNumber(busno);
            bd.setDriverName(driver);
            bd.setPhone(contact);
            bd.setPlace(place);
            bd.setRoute(route);

            BusRouteDAO bdao = new BusRouteDAO();
            boolean result = bdao.add(bd);
            System.out.println("result  "+result);

            if (result == true) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('DATA SAVED SUCCESFULLY');");
                out.println("location='admin.jsp#frm1';");
                out.println("</script>");
            } else {
                 out.println("<script type=\"text/javascript\">");
                out.println("alert('DATA NOT SAVED');");
                out.println("location='admin.jsp#frm1';");
                out.println("</script>");
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
