/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JR
 */
public class user {

    conection obcon = new conection();
    private int id;
    private String email, password, name, last_name, photo, group, campu;
    private Object message="";

    public user() {
    }

    public user(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public user(int id, String email, String password, String name, String last_name, String photo, String group) {

        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.photo = photo;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getCampu() {
        return campu;
    }

    public void setCampus(String campus) {
        this.campu = campus;
    }

    public Object getMessage() {
        return message;
    }

    public void login() {
        String sql="SELECT * FROM users WHERE email='"+this.email+"'";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            rs.next();
            if(rs.getString("password").equals(this.password)){
                this.name=rs.getString("name");
                this.last_name=rs.getString("last_name");
                this.photo=rs.getString("photo");
                this.group=rs.getString("group");
                this.campu=rs.getString("campus");
               this.message=true;
            }
        } catch (SQLException ex) {
            this.message="error en login";
        }
    }
}
