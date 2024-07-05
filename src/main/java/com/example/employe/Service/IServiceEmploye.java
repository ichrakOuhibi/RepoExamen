package com.example.employe.Service;

import com.example.employe.DTO.EmployeDTO;

import java.util.List;

public interface IServiceEmploye {

    EmployeDTO addEmploye(EmployeDTO e);

    List<EmployeDTO> getAllEmploye();

    EmployeDTO getEmployeById(Long id);

    void deleteEmployeById(Long id);
}
