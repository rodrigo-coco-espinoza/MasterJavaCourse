package com.javamastercourse.spring_data_rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javamastercourse.spring_data_rest_demo.model.Entrega;



@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Integer> 
{
    
}