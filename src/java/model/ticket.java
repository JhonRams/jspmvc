/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author JR
 */
public class ticket {

    conection obcon = new conection();
    private int id, seat, travel;
    float cost;
    private String rider, campus;
    private String date_travel, date_sale;
    private travel objTravel;
    private rider objRider;

    public ticket() {
    }

    public ticket(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getTravel() {
        return travel;
    }

    public void setTravel(int travel) {
        this.travel = travel;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getRider() {
        return rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getDate_travel() {
        return date_travel;
    }

    public void setDate_travel(String date_travel) {
        this.date_travel = date_travel;
    }

    public String getDate_sale() {
        return date_sale;
    }

    public void setDate_sale(String date_sale) {
        this.date_sale = date_sale;
    }

    public travel getObjTravel() {
        return objTravel;
    }

    public void setObjTravel(travel objTravel) {
        this.objTravel = objTravel;
    }

    public rider getObjRider() {
        return objRider;
    }

    public void setObjRider(rider objRider) {
        this.objRider = objRider;
    }
    public void add(){
        try {
            String sql="INSERT INTO tickets VALUES(NULL,'"+this.rider+"','"+this.travel+"','"+this.cost+"','"+this.seat+"','"+this.campus+"','"+this.date_travel+"','"+this.date_sale+"')";
        this.obcon.rs_Update(sql);
        } catch (Exception e) {
        }
    }
}
