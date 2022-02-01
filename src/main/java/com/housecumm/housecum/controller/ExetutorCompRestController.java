package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.exetutorComp.ExetutorComp;
import com.housecumm.housecum.model.service.exetutorComp.ExetutorCompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exetutorCompApi")
public class ExetutorCompRestController {

    @Autowired
    private ExetutorCompService exetutorCompService;

    @GetMapping("/exetutorComp")
    public List<ExetutorComp> showAllExetutorComp(){
        List<ExetutorComp> applicationList = exetutorCompService.getAllExetutorComp();
        return applicationList;
    }

    @GetMapping("/exetutorComp/{id}")
    public ExetutorComp getExetutorComp(@PathVariable int id){
        return exetutorCompService.getExetutorComp(id);
    }

    @PostMapping("/exetutorComp")
    public ExetutorComp addNewExetutorComp(@RequestBody ExetutorComp exetutorComp){
        exetutorCompService.saveExetutorComp(exetutorComp);
        return exetutorComp;
    }

    @PutMapping("/exetutorComp")
    public ExetutorComp updateExetutorComp(@RequestBody ExetutorComp exetutorComp){
        exetutorCompService.saveExetutorComp(exetutorComp);
        return exetutorComp;
    }

    @DeleteMapping("/exetutorComp/{id}")
    public String deleteExetutorComp(@PathVariable int id){
        exetutorCompService.deleteExetutorComp(id);
        return "ExetutorComp с id = " + id + " удален";
    }

}
