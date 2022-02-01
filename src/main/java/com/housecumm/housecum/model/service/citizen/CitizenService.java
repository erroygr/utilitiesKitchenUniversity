package com.housecumm.housecum.model.service.citizen;

import com.housecumm.housecum.model.entity.citizen.Citizen;

import java.util.List;

public interface CitizenService {

    List<Citizen> getAllCitizen();
    void saveCitizen(Citizen citizen);
    Citizen getCitizen(int id);
    void deleteCitizen(int id);
}
