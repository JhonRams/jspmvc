/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author JR
 */
public class route {

    conection obcon = new conection();
    private int id;
    private String origin, destination, campus;
    private Time time;

    public route(int id) {
        this.id = id;
    }

    public route() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void add() {
        String sql = "INSERT INTO routes VALUES(NULL,'" + this.origin + "','" + this.destination + "','" + this.time + "','" + this.campus + "')";
        try {
            obcon.rs_Update(sql);
        } catch (Exception e) {
        }
    }

    public void route() {
        String sql = "SELECT * FROM routes WHERE id='" + this.id + "'";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            rs.next();
            this.origin = rs.getString("origin");
            this.destination = rs.getString("destination");
            this.time = rs.getTime("time");
            this.campus = rs.getString("campus");

        } catch (SQLException ex) {

        }
    }

    public ArrayList<route> list() {
        ArrayList<route> list = new ArrayList<route>();
        String sql = "SELECT * FROM routes";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            while (rs.next()) {
                route objRoute = new route();
                objRoute.setId(rs.getInt("id"));
                objRoute.setOrigin(rs.getString("origin"));
                objRoute.setDestination(rs.getString("destination"));
                objRoute.setTime(rs.getTime("time"));
                objRoute.setCampus(rs.getString("campus"));
                list.add(objRoute);
            }
        } catch (SQLException ex) {

        }
        return list;
    }

}
