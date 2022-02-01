package com.housecumm.housecum.model.service.localDormitory;

import com.housecumm.housecum.model.entity.localDormitory.LocationDormitory;
import com.housecumm.housecum.model.entity.localDormitory.LocationDormitoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalDormitoryServiceImpl implements LocalDormitoryService{

    @Autowired
    private LocationDormitoryRepository locationDormitoryRepository;

    @Override
    public List<LocationDormitory> getAllLocationDormitory() {
        return locationDormitoryRepository.findAll();
    }

    @Override
    public void saveLocationDormitory(LocationDormitory locationDormitory) {
        locationDormitoryRepository.save(locationDormitory);
    }

    @Override
    public LocationDormitory getLocationDormitory(int id) {
        LocationDormitory locationDormitory = null;
        Optional<LocationDormitory> optionalLocationDormitory = locationDormitoryRepository.findById(id);
        if (optionalLocationDormitory.isPresent()) {
            locationDormitory = optionalLocationDormitory.get();
        }
        return locationDormitory;
    }

    @Override
    public void deleteLocationDormitory(int id) {
        locationDormitoryRepository.deleteById(id);
    }
}
