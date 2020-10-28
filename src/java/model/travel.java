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
public class travel {

    conection obcon = new conection();
    private int id, route;
    private String driver, vehicle, weekdays, campus, status;
    private driver objDriver;
    private vehicle objVehicle;
    private route objRoute;
    private float price;
    Time start_Time;

    public travel() {
    }

    public travel(int id) {
        this.id = id;
    }

    public route getObjRoute() {
        return objRoute;
    }

    public void setObjRoute(route objRoute) {
        this.objRoute = objRoute;
    }

    public driver getObjDriver() {
        return objDriver;
    }

    public void setObjDriver(driver objDriver) {
        this.objDriver = objDriver;
    }

    public vehicle getObjVehicle() {
        return objVehicle;
    }

    public void setObjVehicle(vehicle objVehicle) {
        this.objVehicle = objVehicle;
    }

    public Time getStart_Time() {
        return start_Time;
    }

    public void setStart_Time(Time start_Time) {
        this.start_Time = start_Time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void travel() {
        try {
            String sql = "SELECT * FROM travels WHERE id='" + this.id + "'";
            ResultSet rs = obcon.rs_Query(sql);
            rs.next();
            this.id = rs.getInt("id");
            this.route = rs.getInt("route");
            this.driver = rs.getString("driver");
            this.vehicle = rs.getString("vehicle");
            this.start_Time = rs.getTime("start_time");
            this.weekdays = rs.getString("weekdays");
            this.price = rs.getFloat("price");
            this.campus= rs.getString("campus");
            this.status=rs.getString("status");
            
            route obj_route = new route(rs.getInt("route"));
                obj_route.route();
                this.objRoute=obj_route;
                vehicle obj_veicle = new vehicle(rs.getString("vehicle"));
                obj_veicle.vehicle();
                this.objVehicle=obj_veicle;
                driver obj_driver=new driver(rs.getString("driver"));
                obj_driver.driver();
                this.objDriver=obj_driver;

        } catch (SQLException ex) {

        }
    }

    public ArrayList<travel> list_day() {
        ArrayList<travel> list = new ArrayList<travel>();
        // String sql = "SELECT * FROM travels WHERE start_time >= CURTIME()";
        String sql = "SELECT * FROM travels WHERE start_time >= CURTIME() ORDER BY start_time";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            while (rs.next()) {
                travel objTravel = new travel();
                objTravel.setId(rs.getInt("id"));
                objTravel.setRoute(rs.getInt("route"));
                objTravel.setDriver(rs.getString("driver"));
                objTravel.setVehicle(rs.getString("vehicle"));
                objTravel.setStart_Time(rs.getTime("start_time"));
                objTravel.setWeekdays(rs.getString("weekdays"));
                objTravel.setPrice(rs.getFloat("price"));
                objTravel.setCampus(rs.getString("campus"));
                objTravel.setStatus(rs.getString("status"));

                route obj_route = new route(rs.getInt("route"));
                obj_route.route();
                objTravel.setObjRoute(obj_route);
                vehicle obj_veicle = new vehicle(rs.getString("vehicle"));
                obj_veicle.vehicle();
                objTravel.setObjVehicle(obj_veicle);
                list.add(objTravel);
            }
        } catch (SQLException ex) {

        }
        return list;
    }

    public ArrayList<travel> list() {
        ArrayList<travel> list = new ArrayList<travel>();
        String sql = "SELECT * FROM travels ORDER BY start_time";
        try {
            ResultSet rs = obcon.rs_Query(sql);
            while (rs.next()) {
                travel objTravel = new travel();
                objTravel.setId(rs.getInt("id"));
                objTravel.setRoute(rs.getInt("route"));
                objTravel.setDriver(rs.getString("driver"));
                objTravel.setVehicle(rs.getString("vehicle"));
                objTravel.setStart_Time(rs.getTime("start_time"));
                objTravel.setWeekdays(rs.getString("weekdays"));
                objTravel.setPrice(rs.getFloat("price"));
                objTravel.setCampus(rs.getString("campus"));
                objTravel.setStatus(rs.getString("status"));

                route obj_route = new route(rs.getInt("route"));
                obj_route.route();
                objTravel.setObjRoute(obj_route);
                vehicle obj_veicle = new vehicle(rs.getString("vehicle"));
                obj_veicle.vehicle();
                objTravel.setObjVehicle(obj_veicle);

                list.add(objTravel);
            }
        } catch (SQLException ex) {

        }
        return list;
    }
}
