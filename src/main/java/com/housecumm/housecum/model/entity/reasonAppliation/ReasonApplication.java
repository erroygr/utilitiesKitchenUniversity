package com.housecumm.housecum.model.entity.reasonAppliation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reason_closing")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReasonApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REASON_CLOSING")
    private  int idReasonApplication;

    @Column(name = "NAME_REASON_CLOSING")
    private String nameReasonApplication;
}
