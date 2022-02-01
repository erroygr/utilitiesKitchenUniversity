package com.housecumm.housecum.model.service.contractorCompany;

import com.housecumm.housecum.model.entity.contractorCompany.ContractorCompany;
import com.housecumm.housecum.model.entity.contractorCompany.ContractorCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractorCompanyServiceImpl implements ContractorCompanyService{

    @Autowired
    private ContractorCompanyRepository contractorCompanyRepository;

    @Override
    public List<ContractorCompany> getAllContractorCompany() {
        return contractorCompanyRepository.findAll();
    }

    @Override
    public void saveContractorCompany(ContractorCompany contractorCompany) {
        contractorCompanyRepository.save(contractorCompany);
    }

    @Override
    public ContractorCompany getContractorCompany(int id) {
        ContractorCompany contractorCompany = null;
        Optional<ContractorCompany> optionalContractorCompany = contractorCompanyRepository.findById(id);
        if (optionalContractorCompany.isPresent()) {
            contractorCompany = optionalContractorCompany.get();
        }
        return contractorCompany;
    }

    @Override
    public void deleteContractorCompany(int id) {
        contractorCompanyRepository.deleteById(id);
    }
}
