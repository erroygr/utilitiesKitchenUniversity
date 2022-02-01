package com.housecumm.housecum.model.entity.kindApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "kind_application")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KindApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_KINDE_APPLICATION")
    private  int idKindApplication;

    @Column(name = "NAME_KIND_APPLICATION")
    private String nameKindApplication;
}
