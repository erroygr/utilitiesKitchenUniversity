package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.reasonAppliation.ReasonApplication;
import com.housecumm.housecum.model.service.reasonAppliation.ReasonApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reasonApplicationApi")
public class ReasonApplicationRestController {

    @Autowired
    private ReasonApplicationService reasonApplicationService;

    @GetMapping("/reasonApplication")
    public List<ReasonApplication> showAllReasonApplication(){
        List<ReasonApplication> reasonApplicationList = reasonApplicationService.getAllReasonApplication();
        return reasonApplicationList;
    }

    @GetMapping("/reasonApplication/{id}")
    public ReasonApplication getReasonApplication(@PathVariable int id){
        return reasonApplicationService.getReasonApplication(id);
    }

    @PostMapping("/reasonApplication")
    public ReasonApplication addNewReasonApplication(@RequestBody ReasonApplication reasonApplication){
        reasonApplicationService.saveReasonApplication(reasonApplication);
        return reasonApplication;
    }

    @PutMapping("/reasonApplication")
    public ReasonApplication updateReasonApplication(@RequestBody ReasonApplication reasonApplication){
        reasonApplicationService.saveReasonApplication(reasonApplication);
        return reasonApplication;
    }

    @DeleteMapping("/reasonApplication/{id}")
    public String deleteReasonApplication(@PathVariable int id){
        reasonApplicationService.deleteReasonApplication(id);
        return "ReasonApplication с id = " + id + " удален";
    }

}
