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
public class rider {

    conection obcon = new conection();
    private String DNI, name, last_name, alert_phone;
    private String birthdate;

    public rider() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAlert_phone() {
        return alert_phone;
    }

    public void setAlert_phone(String alert_phone) {
        this.alert_phone = alert_phone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int add() {
        String sql = "INSERT INTO riders VALUES('" + this.DNI + "','"+this.name+"','"+this.last_name+"','"+this.birthdate+"','"+this.alert_phone+"')";
       int rs=-10;
        try {
            rs = obcon.rs_Update(sql);
        } catch (Exception e) {
        }
        return rs;
    }

    public void rider() {
        String sql = "SELECT * FROM rider WHERE DNI='" + this.DNI + "'";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            rs.next();
            this.name = rs.getString("name");
            this.last_name = rs.getString("last_name");
            this.birthdate = rs.getString("birthdate");
            this.alert_phone = rs.getString("alert_phone");
        } catch (SQLException ex) {

        }
    }

    public ArrayList<rider> list() {
        ArrayList<rider> list = new ArrayList<rider>();
        String sql = "SELECT * FROM riders";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            while (rs.next()) {
                rider objRider = new rider();
                objRider.setName(rs.getString("name"));
                objRider.setLast_name(rs.getString("last_name"));
                objRider.setBirthdate(rs.getString("birthdate"));
                objRider.setAlert_phone(rs.getString("alert_phone"));
            }
        } catch (SQLException ex) {

        }
        return list;
    }

}
