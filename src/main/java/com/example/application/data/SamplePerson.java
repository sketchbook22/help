package com.example.application.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class SamplePerson extends AbstractEntity {

    @OneToOne(targetEntity = Ape.class)
    @JoinColumn(name="ape")
    private Ape ape;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "zooKeeper")
    private Set<Bat> bats;

    private String favoriteBatColor = "soup";

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "samplePerson")
    private Set<SamplePersonAssocCar> cars;
    private String d;
    private String e;

    public Ape getApe() {
        return ape;
    }
    public void setApe(Ape value) {
        this.ape = value;
    }


    public Set<Bat> getBats() {
        return bats;
    }
    public void setBats(Set<Bat> value) {
        this.bats = value;
    }

    public List<String> getAllBatColors(){
        List<String> re = new ArrayList<String>();
        bats.forEach((bat) -> {
            re.add(bat.getColor());
        });
        return re;
    }
    public String getAllBatColorsCsv(){
        return getAllBatColors().toString();
    }
    public List<String> getAllCarColors(){
        List<String> re = new ArrayList<String>();
        cars.forEach((car) -> {
            re.add(car.getCar().getColor());
        });
        return re;
    }
    public String getAllCarColorsCsv(){
        return getAllCarColors().toString();
    }
    public String getFavoriteBatColor(){
        return favoriteBatColor;
    }
    public void setFavoriteBatColor(String value){
        this.favoriteBatColor = value;
    }
    public Set<SamplePersonAssocCar> getCars() {
        return cars;
    }
    public void setCars(Set<SamplePersonAssocCar> value) {
        this.cars = value;
    }
    public String getD() {
        return d;
    }
    public void setD(String value) {
        this.d = value;
    }
    public String getE() {
        return e;
    }
    public void setE(String value) {
        this.e = value;
    }

}
