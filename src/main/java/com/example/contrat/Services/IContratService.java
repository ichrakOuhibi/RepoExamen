package com.example.contrat.Services;

import com.example.contrat.Entities.Contrat;

import java.util.List;

public interface IContratService {
        Contrat addContrat(Contrat contrat);
        List<Contrat> getAllContrats();
        Contrat getContratById(String id);
        void deleteContratById(String id);

}
