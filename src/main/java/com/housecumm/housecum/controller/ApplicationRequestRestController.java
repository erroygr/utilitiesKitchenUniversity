package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.application.ApplicationRequest;
import com.housecumm.housecum.model.service.application.ApplicationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicationApi")
public class ApplicationRequestRestController {

    @Autowired
    private ApplicationRequestService applicationRequestService;

    @GetMapping("/application")
    public List<ApplicationRequest> showAllApplication(){
        List<ApplicationRequest> applicationRequestList = applicationRequestService.getAllApplication();
        return applicationRequestList;
    }

    @GetMapping("/application/{id}")
    public ApplicationRequest getApplication(@PathVariable int id){
        return applicationRequestService.getApplication(id);
    }

    @PostMapping("/application")
    public ApplicationRequest addNewApplication(@RequestBody ApplicationRequest applicationRequest){
        applicationRequestService.saveApplication(applicationRequest);
        return applicationRequest;
    }

    @PutMapping("/application")
    public ApplicationRequest updateApplication(@RequestBody ApplicationRequest applicationRequest){
        applicationRequestService.saveApplication(applicationRequest);
        return applicationRequest;
    }

    @DeleteMapping("/application/{id}")
    public String deleteApplication(@PathVariable int id){
        applicationRequestService.deleteApplication(id);
        return "ApplicationRequest с id = " + id + " удалена";
    }
}
