package com.housecumm.housecum.model.entity.contractorCompany;

import com.housecumm.housecum.model.entity.TipeActivity.TipeActivity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTRACTOR_COMPANY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractorCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPANY")
    private  int idCompany;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "DESCRIBTION")
    private String describtion;

    @Column(name = "TERM_CONTRACT")
    private Date termContract;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TIPE_ACTIV")
    private TipeActivity idTipeActiv;

    @Column(name = "TELEPHONE_COMP")
    private String telephoneComp;

}
