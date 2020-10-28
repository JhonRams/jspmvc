/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JR
 */
public class vehicle {

    conection obcon = new conection();
    private String plate, clas, service, nivel;
    private int seating;

    public vehicle() {
    }

    public vehicle(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void add() {
        String sql = "INSERT INTO vehicles VALUES('" + this.plate + "','" + this.seating + "','" + this.clas + "','" + this.service + "','" + this.nivel + "')";
        try {
           obcon.rs_Update(sql);
        } catch (Exception e) {
        }
    }

    public void vehicle() {
        try {
            String sql = "SELECT * FROM vehicles WHERE plate='" + this.plate + "'";
            ResultSet rs = obcon.rs_Query(sql);
            rs.next();
            this.plate = rs.getString("plate");
            this.seating = rs.getInt("seating");
            this.clas = rs.getString("class");
            this.service = rs.getString("service");
            this.nivel = rs.getString("nivels");

        } catch (SQLException ex) {

        }
    }

    public ArrayList<vehicle> list() {
        ArrayList<vehicle> list = new ArrayList<vehicle>();
        String sql = "SELECT * FROM vehicles";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            while (rs.next()) {
                vehicle objVehicle = new vehicle();
                objVehicle.setPlate(rs.getString("plate"));
                objVehicle.setSeating(rs.getInt("seating"));
                objVehicle.setClas(rs.getString("class"));
                objVehicle.setService(rs.getString("service"));
                objVehicle.setNivel(rs.getString("nivels"));
                list.add(objVehicle);
            }
        } catch (SQLException ex) {

        }
        return list;
    }

}
