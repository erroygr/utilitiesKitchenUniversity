package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.TipeActivity.TipeActivity;
import com.housecumm.housecum.model.service.TipeActivity.TipeActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipeActivityApi")
public class TipeActivityRestController {

    @Autowired
    private TipeActivityService tipeActivityService;

    @GetMapping("/tipeActivity")
    public List<TipeActivity> showAllTipeActivity(){
        List<TipeActivity> tipeActivityList = tipeActivityService.getAllTipeActivity();
        return tipeActivityList;
    }

    @GetMapping("/tipeActivity/{id}")
    public TipeActivity getTipeActivity(@PathVariable int id){
        return tipeActivityService.getTipeActivity(id);
    }

    @PostMapping("/tipeActivity")
    public TipeActivity addNewTipeActivity(@RequestBody TipeActivity tipeActivity){
        tipeActivityService.saveTipeActivity(tipeActivity);
        return tipeActivity;
    }

    @PutMapping("/tipeActivity")
    public TipeActivity updateTipeActivity(@RequestBody TipeActivity tipeActivity){
        tipeActivityService.saveTipeActivity(tipeActivity);
        return tipeActivity;
    }

    @DeleteMapping("/tipeActivity/{id}")
    public String deleteTipeActivity(@PathVariable int id){
        tipeActivityService.deleteTipeActivity(id);
        return "TipeActivity с id = " + id + " удален";
    }
}
