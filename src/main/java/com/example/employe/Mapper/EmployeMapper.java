package com.example.employe.Mapper;

import com.example.employe.DTO.ContratDTO;
import com.example.employe.DTO.EmployeDTO;
import com.example.employe.Entities.Employe;

public class EmployeMapper {

    public static EmployeDTO mapToDto(Employe employe) {

        EmployeDTO employeDTO = EmployeDTO.builder().idEmploye(employe.getIdEmploye())
                .FirstName(employe.getFirstName())
                .LastName(employe.getLastName())
                .Designation(employe.getDesignation())
                .contratId(employe.getContratId())
                .build();

        return employeDTO;
    }

    public static EmployeDTO mapToDto(Employe employe , ContratDTO contratDTO) {

        EmployeDTO employeDTO = EmployeDTO.builder().idEmploye(employe.getIdEmploye())
                .FirstName(employe.getFirstName())
                .LastName(employe.getLastName())
                .Designation(employe.getDesignation())
                .contratId(employe.getContratId())
                .build();

        return employeDTO;
    }

    public static Employe mapToEntity(EmployeDTO employeDTO) {


        Employe employe = Employe.builder()
                .idEmploye(employeDTO.getIdEmploye())
                .FirstName(employeDTO.getFirstName())
                .LastName(employeDTO.getLastName())
                .Designation(employeDTO.getDesignation())
                .contratId(employeDTO.getContratId())
                .build();

        return employe;

    }



}
