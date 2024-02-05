package com.example.application.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import javassist.tools.rmi.Sample;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.boot.web.server.Cookie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Bat extends AbstractEntity {

	private String color;

    private SamplePerson zooKeeper;
    public String getColor() {
        return color;
    }
    public void setColor(String value) {
        this.color = value;
    }

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "SAMPlE_PERSON_ID", referencedColumnName = "SAMPLE_PERSON_ID", nullable = false)
    public SamplePerson getZooKeeper() {
        return zooKeeper;
    }
    public void setZooKeeper(SamplePerson value){
        this.zooKeeper = value;
    }

}
