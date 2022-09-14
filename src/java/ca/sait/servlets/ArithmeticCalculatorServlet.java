/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author phamh
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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
        request.setAttribute("result", "---");
        request.setAttribute("firstNum","");
        request.setAttribute("secNum","");
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String firstNum = request.getParameter("first");
        String secNum = request.getParameter("second");
        String calc = request.getParameter("calc");
        
        int firstInt;
        int secInt;
        
        if ("".equals(firstNum) || "".equals(secNum)) {
            request.setAttribute("result", "invalid");
        } else {
            try {
                firstInt = Integer.parseInt(firstNum);
                secInt = Integer.parseInt(secNum);
                
                switch (calc) {
                    case "+":
                        request.setAttribute("result", firstInt + secInt);
                        break;
                    case "-":
                        request.setAttribute("result", firstInt - secInt);
                        break;
                    case "*":
                        request.setAttribute("result", firstInt * secInt);
                        break;
                    default:
                        request.setAttribute("result", firstInt % secInt);
                        break;
                }
            } 
            catch(Exception ex) {
                request.setAttribute("result","invalid");
            }
        }
        
        request.setAttribute("firstNum",firstNum);
        request.setAttribute("secNum",secNum);
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
