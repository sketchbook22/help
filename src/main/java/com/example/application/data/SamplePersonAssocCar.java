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
public class SamplePersonAssocCar extends AbstractEntity {

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "samplePerson")
    private SamplePerson samplePerson;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "car")
    private Car car;

    public SamplePerson getSamplePerson() {
        return samplePerson;
    }
    public void setSamplePerson(SamplePerson value) {
        this.samplePerson = value;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car value) {
        this.car = value;
    }


}
