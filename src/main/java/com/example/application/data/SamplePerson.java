package com.example.application.data;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class SamplePerson extends AbstractEntity {

    @OneToOne(targetEntity = Ape.class)
    @JoinColumn(name="ape")
    private Ape ape;
    private String b;
    private String c;
    private String d;
    private String e;

    public Ape getApe() {
        return ape;
    }
    public void setApe(Ape value) {
        this.ape = value;
    }
    public String getB() {
        return b;
    }
    public void setB(String value) {
        this.b = value;
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
