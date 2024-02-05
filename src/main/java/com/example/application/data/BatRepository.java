package com.example.application.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BatRepository
        extends
            JpaRepository<Bat, Long>,
            JpaSpecificationExecutor<Bat> {

}
