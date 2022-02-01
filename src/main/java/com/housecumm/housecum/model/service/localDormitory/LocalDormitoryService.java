package com.housecumm.housecum.model.service.localDormitory;

import com.housecumm.housecum.model.entity.kindApplication.KindApplication;
import com.housecumm.housecum.model.entity.localDormitory.LocationDormitory;

import java.util.List;

public interface LocalDormitoryService {

    List<LocationDormitory> getAllLocationDormitory();
    void saveLocationDormitory(LocationDormitory locationDormitory);
    LocationDormitory getLocationDormitory(int id);
    void deleteLocationDormitory(int id);
}
