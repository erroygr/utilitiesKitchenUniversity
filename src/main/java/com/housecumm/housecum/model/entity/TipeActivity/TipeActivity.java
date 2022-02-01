package com.housecumm.housecum.model.entity.TipeActivity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TIPE_ACTIVITY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipeActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPE_ACTIV")
    private  int idTipeActiv;

    @Column(name = "ACTIV_NAME")
    private String activName;

}