/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JR
 */
public class conection {
public String message="";
    private Connection conn = null;

    public conection() {
        try {
            if (conn == null) {
                String connectionURL = "jdbc:mysql://localhost:3306/dbtravelbus";
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(connectionURL, "root", "");
                if (!conn.isClosed()) {
                    //this.message="conexion establecida";
                }
            }
        } catch (Exception ex) {
            this.message="error en la conexión" + ex;
        }

    }

    public int rs_Update(String sql) {
        int std;
        try {
            Statement st = conn.createStatement();
            std = st.executeUpdate(sql);
        } catch (SQLException ex) {
            this.message="Error Update" + ex;
            std = -1;
        }
        return std;
    }

    public ResultSet rs_Query(String sql) {
        ResultSet rs = null;
        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
           this.message="Error Query" + ex;
        }
        return rs;
    }
    public void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
            this.message="Error close" + ex;
        }
    }

}
