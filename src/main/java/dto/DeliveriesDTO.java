/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Cargo;
import entities.Trucks;
import java.util.Date;

/**
 *
 * @author Jeppe
 */
public class DeliveriesDTO {
    private Long id;
    private Cargo cargo;
    private Trucks truck;
    private Date shippingDate;
    private String fromLocation;
    private String toLocation;  
    
    public DeliveriesDTO(Long id, Cargo cargo, Trucks truck, Date shippingDate, String fromLocation, String toLocation) {
        this.id = id;
        this.cargo = cargo;
        this.truck = truck;
        this.shippingDate = shippingDate;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    } 
    
    public DeliveriesDTO(){
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Trucks getTruck() {
        return truck;
    }

    public void setTruck(Trucks truck) {
        this.truck = truck;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }
 
}
