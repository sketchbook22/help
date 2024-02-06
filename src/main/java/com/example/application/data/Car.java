package com.example.application.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @JsonBackReference
    @ManyToMany(mappedBy="cars")
    private Set<SamplePerson> drivers;

    public String getColor() {
        return color;
    }
    public void setColor(String value) {
        this.color = value;
    }

    public Set<SamplePerson> getDrivers() { return drivers;}
    public void setDrivers(Set<SamplePerson> value){
        this.drivers = value;
    }

}
