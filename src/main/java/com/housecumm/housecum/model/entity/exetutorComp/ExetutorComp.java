package com.housecumm.housecum.model.entity.exetutorComp;

import com.housecumm.housecum.model.entity.contractorCompany.ContractorCompany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EXETUTOR_COMP")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExetutorComp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EXETUTOR_COMP")
    private  int idExetutorComp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ID_COMPANY_COMPANY")
    private ContractorCompany idIdCompanyCompany;

    @Column(name = "FIRST_NAME_EXETUTOR_COMP")
    private String firstNameExetutorComp;

    @Column(name = "LAST_NAME_EXETUTOR_COMP")
    private String lastNameExetutorComp;

    @Column(name = "PATRONYMIC_EXETUTOR_COMP")
    private String patronymicExetutorComp;

    @Column(name = "COMPANY_POST")
    private String companyPost;

    @Column(name = "TELEPHONE_COMP")
    private String telephoneComp;
}
