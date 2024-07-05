package com.example.contrat.Controller;

import com.example.contrat.Entities.Contrat;
import com.example.contrat.Services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratController {

    @Autowired
    private ContratService contratService;



    @PostMapping("/save")
    public ResponseEntity<Contrat> addContrat(@RequestBody Contrat contrat) {
        Contrat addedContrat = contratService.addContrat(contrat);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedContrat);
    }

    @GetMapping
    public ResponseEntity<List<Contrat>> getAllContrats() {
        List<Contrat> contrats = contratService.getAllContrats();
        return ResponseEntity.ok(contrats);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contrat> getContratById(@PathVariable String id) {
        Contrat contrat = contratService.getContratById(id);
        return ResponseEntity.ok(contrat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContratById(@PathVariable String id) {
        contratService.deleteContratById(id);
        return ResponseEntity.noContent().build();
    }
}
