/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.travel;

/**
 *
 * @author JR
 */
@WebServlet(name = "sales", urlPatterns = {"/sales"})
public class sales extends HttpServlet {

    String diasSemana[] = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SÁBADO"};
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    DateFormat dateFormatQSL = new SimpleDateFormat("yyyy-MM-dd");
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
            Calendar hoy = Calendar.getInstance();
            Date hoydia = hoy.getTime();
            String table_head = "<th class=hoydia>" + diasSemana[hoydia.getDay()] + "<br><label>" + dateFormat.format(hoydia) + "</label></th>";
            for (int i = 0; i < 6; i++) {
                hoy.add(Calendar.DATE, 1);
                Date utilDate = hoy.getTime();
                table_head += "<th>" + diasSemana[utilDate.getDay()] + "<br><label>" + dateFormat.format(utilDate) + "</label></th>";
            }
            request.setAttribute("table_head", table_head);
            String table_body = "";

            travel objTravel = new travel();
            String td = "";
            for (travel ve : objTravel.list_day()) {

                String weekday[] = ve.getWeekdays().split("/");
                if (weekday[hoydia.getDay()].equals("1")) {
                    td += "<div class=\"text-left bg-primary cuadro\">Clase: " + ve.getObjVehicle().getClas()
                            + "<br>Destino: " + ve.getObjRoute().getDestination()
                            + "<br>Hora salida: " + ve.getStart_Time()
                            + "<br><h4>Precio: S/" + ve.getPrice() + "</h4>"
                            + "<a href=\"travel?travel=" + ve.getId() + "&cost=" + ve.getPrice() + "&campus=" + ve.getCampus() + "&date_t=" + dateFormatQSL.format(hoydia) + "\" class=\"btn btn-dark\">Agregar Pasagero</a>"
                            + "</div>";
                }
            }
            table_body += "<td>" + td + "</td>";
            Calendar hoy1 = Calendar.getInstance();
            for (int i = 0; i < 6; i++) {
                hoy1.add(Calendar.DATE, 1);
                Date utilDate1 = hoy1.getTime();
                String td1 = "";
                for (travel ve : objTravel.list()) {
                    String weekday[] = ve.getWeekdays().split("/");
                    if (weekday[utilDate1.getDay()].equals("1")) {
                        td1 += "<div class=\"text-left bg-primary cuadro\">Clase: " + ve.getObjVehicle().getClas()
                                + "<br>Destino: " + ve.getObjRoute().getDestination()
                                + "<br>Hora salida: " + ve.getStart_Time()
                                + "<br><h4>Precio: S/" + ve.getPrice() + "</h4>"
                                + "<a href=\"travel?travel=" + ve.getId() + "&cost=" + ve.getPrice() + "&campus=" + ve.getCampus() + "&date_t=" + dateFormatQSL.format(utilDate1) + "\" class=\"btn btn-dark\">Agregar Pasagero</a>"
                                + "</div>";
                    }
                }
                table_body += "<td>" + td1 + "</td>";
            }
            request.setAttribute("table_body", table_body);

            RequestDispatcher us = request.getRequestDispatcher("index.jsp");
            us.forward(request, response);
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
