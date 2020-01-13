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
public class CargoDTO {
    //private Long id;
    private String name;
    private double weight;
    private int units;   

    public CargoDTO(String name, double weight, int units) {
        this.name = name;
        this.weight = weight;
        this.units = units;
    }
    
    public CargoDTO(){
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
    
}

