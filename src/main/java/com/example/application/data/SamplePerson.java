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

    private String favoriteBatColor;
    private String c;
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
    public String getFavoriteBatColor(){
        return favoriteBatColor;
    }
    public void setFavoriteBatColor(String value){
        this.favoriteBatColor = value;
    }
    public String getC() {
        return c;
    }
    public void setC(String value) {
        this.c = value;
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
