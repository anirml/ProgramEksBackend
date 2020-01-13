/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Jeppe
 */
public class DriversDTO {
    private Long id;
    private String name;
    private int booked;   

    public DriversDTO(Long id, String name, int booked) {
        this.id = id;
        this.name = name;
        this.booked = booked;
    }  
    
    public DriversDTO(){
        
    }    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }
    
    
    
    
    
}
