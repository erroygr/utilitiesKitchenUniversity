package com.housecumm.housecum.model.entity.typeApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "type_application")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE_APPLICATION")
    private  int idTypeApplication;

    @Column(name = "NAME_TYPE_APPLICATION")
    private String nameTypeApplication;
}
