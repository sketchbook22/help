package com.example.application.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Car extends AbstractEntity {

	private String color;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "car")
    private Set<SamplePersonAssocCar> drivers;

    public String getColor() {
        return color;
    }
    public void setColor(String value) {
        this.color = value;
    }

    public Set<SamplePersonAssocCar> getDrivers() { return drivers;}
    public void setDrivers(Set<SamplePersonAssocCar> value){
        this.drivers = value;
    }

}
