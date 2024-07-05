package com.example.employe.Controller;

import com.example.employe.DTO.EmployeDTO;
import com.example.employe.Service.IServiceEmploye;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeController {

    private final IServiceEmploye employeService;

    @PostMapping("/save")
    public ResponseEntity<EmployeDTO> addEmploye(@RequestBody EmployeDTO employeDTO) {
        EmployeDTO savedEmploye = employeService.addEmploye(employeDTO);
        return ResponseEntity.ok(savedEmploye);
    }

    @GetMapping
    public ResponseEntity<List<EmployeDTO>> getAllEmployes() {
        List<EmployeDTO> employes = employeService.getAllEmploye();
        return ResponseEntity.ok(employes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeDTO> getEmployeById(@PathVariable Long id) {
        EmployeDTO employeDTO = employeService.getEmployeById(id);
        return ResponseEntity.ok(employeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployeById(@PathVariable Long id) {
        employeService.deleteEmployeById(id);
        return ResponseEntity.noContent().build();
    }
}
