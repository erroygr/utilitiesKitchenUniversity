package com.housecumm.housecum.model.entity.citizen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CITIZEN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CITIZEN")
    private  int idCitizen;

    @Column(name = "FIRST_NAME_CITIZEN")
    private String firstNameCitizen;

    @Column(name = "LAST_NAME_CITIZEN")
    private String lastNameCitizen;

    @Column(name = "PATRONYMIC_CITIZEN")
    private String patronymicCitizen;

    @Column(name = "STUDENT_ID_NUMBER")
    private Long studentIdNumber;

    @Column(name = "DATE_BITTH")
    private Date dateBitth;
}