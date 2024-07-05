package com.example.employe.Service;

import com.example.employe.DTO.ContratDTO;
import com.example.employe.DTO.EmployeDTO;
import com.example.employe.Entities.Employe;
import com.example.employe.Mapper.EmployeMapper;
import com.example.employe.Repository.EmployeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeService implements IServiceEmploye {

    private final EmployeRepository employeRepository;

    public EmployeDTO addEmploye(EmployeDTO e) {
        Employe employe = employeRepository.save(EmployeMapper.mapToEntity(e));
        return EmployeMapper.mapToDto(employe);

    }


    public List<EmployeDTO> getAllEmploye() {
        return employeRepository.findAll()
                .stream()
                .map(employe -> EmployeMapper.mapToDto(employe)).
                collect(Collectors.toList()) ;
    }


    public EmployeDTO getEmployeById(Long id) {
        Employe employe = employeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        ContratDTO contratDTO = ContratClient.getById(employe.getContratId());
        return EmployeMapper.mapToDto(employe, contratDTO);

    }
    public void deleteEmployeById(Long id) {
        employeRepository.deleteById(id);

    }

}
