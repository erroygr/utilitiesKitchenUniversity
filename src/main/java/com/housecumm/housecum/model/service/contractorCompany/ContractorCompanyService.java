package com.housecumm.housecum.model.service.contractorCompany;

import com.housecumm.housecum.model.entity.citizen.Citizen;
import com.housecumm.housecum.model.entity.contractorCompany.ContractorCompany;

import java.util.List;

public interface ContractorCompanyService {

    List<ContractorCompany> getAllContractorCompany();
    void saveContractorCompany(ContractorCompany contractorCompany);
    ContractorCompany getContractorCompany(int id);
    void deleteContractorCompany(int id);
}
