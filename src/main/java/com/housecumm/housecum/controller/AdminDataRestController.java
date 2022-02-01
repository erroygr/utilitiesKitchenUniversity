package com.housecumm.housecum.controller;


import com.housecumm.housecum.model.entity.adminData.AdminData;
import com.housecumm.housecum.model.service.adminData.AdminDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adminDataApi")
public class AdminDataRestController {

    @Autowired
    private AdminDataService adminDataService;

    @GetMapping("/adminData")
    public List<AdminData> showAllAdminData(){
        List<AdminData> adminDataList = adminDataService.getAllAdminDate();
        return adminDataList;
    }

    @GetMapping("/adminData/{id}")
    public AdminData getAdminData(@PathVariable int id){
        return adminDataService.getAdminData(id);
    }

    @PostMapping("/adminData")
    public AdminData addNewAdminData(@RequestBody AdminData adminData){
        adminDataService.saveAdminData(adminData);
        return adminData;
    }

    @PutMapping("/adminData")
    public AdminData updateAdminData(@RequestBody AdminData adminData){
        adminDataService.saveAdminData(adminData);
        return adminData;
    }

    @DeleteMapping("/adminData/{id}")
    public String deleteAdminData(@PathVariable int id){
        adminDataService.deleteAdminData(id);
        return "AdminData с id = " + id + " удален";
    }

}
