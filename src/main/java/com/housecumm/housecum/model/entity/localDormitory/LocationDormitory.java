package com.housecumm.housecum.model.entity.localDormitory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "location_dormitory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDormitory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOCATION_DORMITORYP")
    private  int idLocationDormitoryp;

    @Column(name = "STREET_LOC")
    private String streetLoc;

    @Column(name = "NUM_HOUSE_LOC")
    private String numHouseLoc;

    @Column(name = "NUM_FLOOR_LOC")
    private String numFloorLoc;

    @Column(name = "NUM_ROOM_LOC")
    private String numRoomLoc;

    @Column(name = "DESCRIBTION_LOC")
    private String describtionLoc;

}
