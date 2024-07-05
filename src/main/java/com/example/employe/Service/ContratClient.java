package com.example.employe.Service;

import com.example.employe.DTO.ContratDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "employe" , url = "http://localhost:8090")
public interface ContratClient {


    @GetMapping("/employe/getbyid/{id}")
    static ContratDTO getById(@PathVariable("id") String id){
        return null ;
    }

}