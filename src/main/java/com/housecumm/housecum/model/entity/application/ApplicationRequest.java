package com.housecumm.housecum.model.entity.application;

import com.housecumm.housecum.model.entity.citizen.Citizen;
import com.housecumm.housecum.model.entity.exetutorComp.ExetutorComp;
import com.housecumm.housecum.model.entity.kindApplication.KindApplication;
import com.housecumm.housecum.model.entity.localDormitory.LocationDormitory;
import com.housecumm.housecum.model.entity.reasonAppliation.ReasonApplication;
import com.housecumm.housecum.model.entity.statusApplication.StatusApplication;
import com.housecumm.housecum.model.entity.typeApplication.TypeApplication;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "application")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_APPLICATION")
    private  int idApplication;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_APPLICANT")
    private Citizen idCitizen;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_performer_comp")
    private ExetutorComp exetutorComp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TYPE_APPLICATION")
    private TypeApplication typeApplication;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_KIND_APPLICATION")
    private KindApplication kindApplication;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_status")
    private StatusApplication statusApplication;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_LOC")
    private LocationDormitory locationDormitory;

    @Column(name = "describtion_application")
    private String describtionApplication;

    @Column(name = "date_start")
    private Date dateStart;

    @Column(name = "date_finish")
    private Date dateFinish;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_reason_closing")
    private ReasonApplication reasonApplication;
}
