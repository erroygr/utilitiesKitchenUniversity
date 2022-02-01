package com.housecumm.housecum.model.entity.adminData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "admin_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ADMIN_DATA")
    private  int idADminData;

    @Column(name = "FIRST_NAME_ADMIN_DATA")
    private String firstNameAdminData;

    @Column(name = "LAST_NAME_ADMIN_DATA")
    private String lastNameAdminData;

    @Column(name = "LOGIN_ADMIN_DATA")
    private String loginAdminData;
}
