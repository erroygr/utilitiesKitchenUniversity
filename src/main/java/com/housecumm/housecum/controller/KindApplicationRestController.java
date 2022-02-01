package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.kindApplication.KindApplication;
import com.housecumm.housecum.model.service.kindApplication.KindApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kindApplicationApi")
public class KindApplicationRestController {

    @Autowired
    private KindApplicationService kindApplicationService;

    @GetMapping("/kindApplication")
    public List<KindApplication> showAllKindApplication(){
        List<KindApplication> applicationList = kindApplicationService.getAllKindApplication();
        return applicationList;
    }

    @GetMapping("/kindApplication/{id}")
    public KindApplication getKindApplication(@PathVariable int id){
        return kindApplicationService.getKindApplication(id);
    }

    @PostMapping("/kindApplication")
    public KindApplication addNewKindApplication(@RequestBody KindApplication kindApplication){
        kindApplicationService.saveKindApplication(kindApplication);
        return kindApplication;
    }

    @PutMapping("/kindApplication")
    public KindApplication updateKindApplication(@RequestBody KindApplication kindApplication){
        kindApplicationService.saveKindApplication(kindApplication);
        return kindApplication;
    }

    @DeleteMapping("/kindApplication/{id}")
    public String deleteKindApplication(@PathVariable int id){
        kindApplicationService.deleteKindApplication(id);
        return "KindApplication с id = " + id + " удален";
    }
}
