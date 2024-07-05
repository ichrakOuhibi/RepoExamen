package com.example.contrat.Services;


import com.example.contrat.Entities.Contrat;
import com.example.contrat.Repository.ContratRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ContratService implements IContratService {

    @Autowired
    private  ContratRepo contratRepository;

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getContratById(String id) {
        Optional<Contrat> contrat = contratRepository.findById(id);
        if (contrat.isPresent()) {
            return contrat.get();
        }
        throw new RuntimeException("Contrat not found with id: " + id);
    }

    @Override
    public void deleteContratById(String id) {
        contratRepository.deleteById(id);
    }
}
