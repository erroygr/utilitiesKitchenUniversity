package com.housecumm.housecum.controller;

import com.housecumm.housecum.model.entity.contractorCompany.ContractorCompany;
import com.housecumm.housecum.model.service.contractorCompany.ContractorCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contractorCompanyApi")
public class ContractorCompanyRestController {

    @Autowired
    private ContractorCompanyService companyService;

    @GetMapping("/contractor")
    public List<ContractorCompany> showAllContractorCompany(){
        List<ContractorCompany> applicationList = companyService.getAllContractorCompany();
        return applicationList;
    }

    @GetMapping("/contractor/{id}")
    public ContractorCompany getContractorCompany(@PathVariable int id){
        return companyService.getContractorCompany(id);
    }

    @PostMapping("/contractor")
    public ContractorCompany addNewContractorCompany(@RequestBody ContractorCompany contractorCompany){
        companyService.saveContractorCompany(contractorCompany);
        return contractorCompany;
    }

    @PutMapping("/contractor")
    public ContractorCompany updateContractorCompany(@RequestBody ContractorCompany contractorCompany){
        companyService.saveContractorCompany(contractorCompany);
        return contractorCompany;
    }

    @DeleteMapping("/contractor/{id}")
    public String deleteContractorCompany(@PathVariable int id){
        companyService.deleteContractorCompany(id);
        return "ContractorCompany с id = " + id + " удален";
    }
}
