package com.helpme.demohelpme.repository;


import com.helpme.demohelpme.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICasoRepository extends JpaRepository <Caso, Long> {


}
