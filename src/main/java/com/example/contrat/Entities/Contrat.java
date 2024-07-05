package com.example.contrat.Entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection="Contrat")
public class Contrat {
    @Id
     String idContrat;
     String Details;


}
