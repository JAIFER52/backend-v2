package com.helpme.demohelpme.repository;


import com.helpme.demohelpme.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDelitoRepository extends JpaRepository <Delito, Long> {
}
