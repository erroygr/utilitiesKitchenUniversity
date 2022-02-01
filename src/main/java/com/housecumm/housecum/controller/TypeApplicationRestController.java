package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.typeApplication.TypeApplication;
import com.housecumm.housecum.model.service.typeApplication.TypeApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeApplicationApi")
public class TypeApplicationRestController {

    @Autowired
    private TypeApplicationService typeApplicationService;

    @GetMapping("/typeApplication")
    public List<TypeApplication> showAllTypeApplication(){
        List<TypeApplication> typeApplicationList = typeApplicationService.getAllTypeApplication();
        return typeApplicationList;
    }

    @GetMapping("/typeApplication/{id}")
    public TypeApplication getTypeApplication(@PathVariable int id){
        return typeApplicationService.getTypeApplication(id);
    }

    @PostMapping("/typeApplication")
    public TypeApplication addNewAdminData(@RequestBody TypeApplication typeApplication){
        typeApplicationService.saveTypeApplication(typeApplication);
        return typeApplication;
    }

    @PutMapping("/typeApplication")
    public TypeApplication updateAdminData(@RequestBody TypeApplication typeApplication){
        typeApplicationService.saveTypeApplication(typeApplication);
        return typeApplication;
    }

    @DeleteMapping("/typeApplication/{id}")
    public String deleteAdminData(@PathVariable int id){
        typeApplicationService.deleteTypeApplication(id);
        return "TypeApplication с id = " + id + " удален";
    }
}
