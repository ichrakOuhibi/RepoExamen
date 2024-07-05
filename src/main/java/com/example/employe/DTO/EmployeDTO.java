package com.example.employe.DTO;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class EmployeDTO {
    @Id
    private String idEmploye;
    private String FirstName;
    private String LastName;
    private String Designation;
    private  String contratId;

    public EmployeDTO(){}
}
