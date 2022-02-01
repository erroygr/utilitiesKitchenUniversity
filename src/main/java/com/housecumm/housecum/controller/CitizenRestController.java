package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.citizen.Citizen;
import com.housecumm.housecum.model.service.citizen.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sitizenApi")
public class CitizenRestController {

    @Autowired
    private CitizenService citizenService;

    @GetMapping("/sitizen")
    public List<Citizen> showAllCitizen(){
        List<Citizen> citizenList = citizenService.getAllCitizen();
        return citizenList;
    }

    @GetMapping("/sitizen/{id}")
    public Citizen getCitizen(@PathVariable int id){
        return citizenService.getCitizen(id);
    }

    @PostMapping("/sitizen")
    public Citizen addNewCitizen(@RequestBody Citizen citizen){
        citizenService.saveCitizen(citizen);
        return citizen;
    }

    @PutMapping("/sitizen")
    public Citizen updateCitizen(@RequestBody Citizen citizen){
        citizenService.saveCitizen(citizen);
        return citizen;
    }

    @DeleteMapping("/sitizen/{id}")
    public String deleteCitizen(@PathVariable int id){
        citizenService.deleteCitizen(id);
        return "Citizen с id = " + id + " удален";
    }
}
