/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Jeppe
 */
@Entity
@Table(name = "deliveries")
public class Deliveries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Cargo cargo;

    private Trucks truck;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "shipping_date")
    private Date shippingDate;
    @Column(name = "from_location")
    private String fromLocation;
    @Column(name = "to_location")
    private String toLocation;   

    public Deliveries() {
    }    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    
}
