/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.rider;

/**
 *
 * @author JR
 */
@WebServlet(name = "ticket", urlPatterns = {"/ticket"})
public class ticket extends HttpServlet {

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
        try {

            rider objRider = new rider();
            objRider.setDNI(request.getParameter("DNI"));
            objRider.setName(request.getParameter("nombre"));
            objRider.setLast_name(request.getParameter("apellido"));
            objRider.setBirthdate(request.getParameter("fechaNa"));
            objRider.setAlert_phone(request.getParameter("telefono"));
            int s = objRider.add();
            model.ticket objTicket = new model.ticket();
            objTicket.setRider(request.getParameter("DNI"));
            objTicket.setTravel(Integer.parseInt(request.getParameter("travel")));
            objTicket.setCost(Float.parseFloat(request.getParameter("cost")));
            objTicket.setSeat(Integer.parseInt(request.getParameter("bus")));
            objTicket.setCampus(request.getParameter("campus"));
            objTicket.setDate_travel(request.getParameter("date_travel"));
            Calendar hoy = Calendar.getInstance();
            Date hoydia = hoy.getTime();
            DateFormat dateFormatQSL = new SimpleDateFormat("yyyy-MM-dd");
            objTicket.setDate_sale(dateFormatQSL.format(hoydia));
            objTicket.add();
            //response.sendRedirect("sales");
            double costo = objTicket.getCost();
            double igv = costo * 0.18;
            double total = costo+igv;
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Boleto</title>");
                out.println("<link rel=\"stylesheet\" href=\"./css/estilos.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"boleta\">\n"
                        + "    <h1 class=\"text-center\">Transporte</h1>\n"
                        + "    <h3>Boleto de viaje 45875 </h3><br>\n"
                        + "   <p> DNI/ " + request.getParameter("DNI") + "/ Nombre:/" + request.getParameter("nombre") + " / " + request.getParameter("apellido") + "/</p>\n"
                        + "    <p>Nurmero aciento: /" + request.getParameter("bus") + "/  Hora salida:/8:5/</p>\n"
                        + "   <p> Fecha Venta: /" + dateFormatQSL.format(hoydia) + "/</p>\n"
                        + "    <p>Fecha Salida:/" + request.getParameter("date_travel") + "/</p>\n"
                        + "    <p>costo: " + costo + "</p>\n"
                        + "    <p>IGV:" + igv + "</p>\n"
                        + "    <p>Total=" + total + "</p>\n"
                        + "</div>\n"
                        + "<br>\n"
                        + "<div class=\"imprime\">\n"
                        + "    <a href=\"sales\" class=\"btn btn-primary\">Imprimir</a>\n"
                        + "</div>");

                out.println("</body>");
                out.println("</html>");

            }

        } catch (Exception e) {
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
