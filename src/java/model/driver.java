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
public class driver {

    conection obcon = new conection();
    private String DNI, name, last_name, address, category, phone;

    public driver(String DNI) {
        this.DNI = DNI;
    }

    public driver() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void add() {
        String sql = "INSERT INTO drivers VALUES('" + this.DNI + "','" + this.name + "','" + this.last_name + "','" + this.address + "','" + this.category + "','" + this.phone + "')";
        try {
            obcon.rs_Update(sql);
        } catch (Exception e) {
        }
    }

    public void driver() {
        String sql = "SELECT * FROM drivers WHERE DNI='" + this.DNI + "'";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            rs.next();
            this.name = rs.getString("DNI");
            this.name = rs.getString("name");
            this.last_name = rs.getString("last_name");
            this.address = rs.getString("address");
            this.category = rs.getString("category");
            this.phone = rs.getString("phone");

        } catch (SQLException ex) {

        }
    }

    public ArrayList<driver> list() {
        ArrayList<driver> list = new ArrayList<driver>();
        String sql = "SELECT * FROM drivers";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            while (rs.next()) {
                driver objDriver = new driver();
                objDriver.setDNI(rs.getString("DNI"));
                objDriver.setName(rs.getString("name"));
                objDriver.setLast_name(rs.getString("last_name"));
                objDriver.setAddress(rs.getString("address"));
                objDriver.setCategory(rs.getString("category"));
                objDriver.setPhone(rs.getString("phone"));
                list.add(objDriver);
            }
        } catch (SQLException ex) {

        }
        return list;
    }
}
