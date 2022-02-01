package com.housecumm.housecum.model.entity.statusApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "status_application")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STATUS_APPLICATION")
    private  int idStatusApplication;

    @Column(name = "NAME_STATUS_APPLICATION")
    private String nameStatusApplication;
}
