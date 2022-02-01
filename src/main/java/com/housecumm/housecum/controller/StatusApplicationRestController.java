package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.statusApplication.StatusApplication;
import com.housecumm.housecum.model.service.statusApplication.StatusApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statusApplicationApi")
public class StatusApplicationRestController {

    @Autowired
    private StatusApplicationService statusApplicationService;

    @GetMapping("/statusApplication")
    public List<StatusApplication> showAllStatusApplication(){
        List<StatusApplication> statusApplicationList = statusApplicationService.getAllStatusApplication();
        return statusApplicationList;
    }

    @GetMapping("/statusApplication/{id}")
    public StatusApplication getStatusApplication(@PathVariable int id){
        return statusApplicationService.getStatusApplication(id);
    }

    @PostMapping("/statusApplication")
    public StatusApplication addNewStatusApplication(@RequestBody StatusApplication statusApplication){
        statusApplicationService.saveStatusApplication(statusApplication);
        return statusApplication;
    }

    @PutMapping("/statusApplication")
    public StatusApplication updateStatusApplication(@RequestBody StatusApplication statusApplication){
        statusApplicationService.saveStatusApplication(statusApplication);
        return statusApplication;
    }

    @DeleteMapping("/statusApplication/{id}")
    public String deleteStatusApplication(@PathVariable int id){
        statusApplicationService.deleteStatusApplication(id);
        return "StatusApplication с id = " + id + " удален";
    }
}
