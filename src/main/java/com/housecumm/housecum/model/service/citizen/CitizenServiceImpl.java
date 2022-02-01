package com.housecumm.housecum.model.service.citizen;

import com.housecumm.housecum.model.entity.citizen.Citizen;
import com.housecumm.housecum.model.entity.citizen.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitizenServiceImpl implements CitizenService{

    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public List<Citizen> getAllCitizen() {
        return citizenRepository.findAll();
    }

    @Override
    public void saveCitizen(Citizen citizen) {
        citizenRepository.save(citizen);
    }

    @Override
    public Citizen getCitizen(int id) {
        Citizen citizen = null;
        Optional<Citizen> optionalCitizen = citizenRepository.findById(id);
        if (optionalCitizen.isPresent()) {
            citizen = optionalCitizen.get();
        }
        return citizen;
    }

    @Override
    public void deleteCitizen(int id) {
        citizenRepository.deleteById(id);
    }
}
