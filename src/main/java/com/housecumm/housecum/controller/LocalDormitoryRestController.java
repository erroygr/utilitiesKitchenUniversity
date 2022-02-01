package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.localDormitory.LocationDormitory;
import com.housecumm.housecum.model.service.localDormitory.LocalDormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localDormitoryApi")
public class LocalDormitoryRestController {

    @Autowired
    private LocalDormitoryService localDormitoryService;

    @GetMapping("/localDormitory")
    public List<LocationDormitory> showAllLocationDormitory(){
        List<LocationDormitory> locationDormitories = localDormitoryService.getAllLocationDormitory();
        return locationDormitories;
    }

    @GetMapping("/localDormitory/{id}")
    public LocationDormitory getLocationDormitory(@PathVariable int id){
        return localDormitoryService.getLocationDormitory(id);
    }

    @PostMapping("/localDormitory")
    public LocationDormitory addNewLocationDormitory(@RequestBody LocationDormitory locationDormitory){
        localDormitoryService.saveLocationDormitory(locationDormitory);
        return locationDormitory;
    }

    @PutMapping("/localDormitory")
    public LocationDormitory updateLocationDormitory(@RequestBody LocationDormitory locationDormitory){
        localDormitoryService.saveLocationDormitory(locationDormitory);
        return locationDormitory;
    }

    @DeleteMapping("/localDormitory/{id}")
    public String deleteLocationDormitory(@PathVariable int id){
        localDormitoryService.deleteLocationDormitory(id);
        return "LocationDormitory с id = " + id + " удален";
    }

}
