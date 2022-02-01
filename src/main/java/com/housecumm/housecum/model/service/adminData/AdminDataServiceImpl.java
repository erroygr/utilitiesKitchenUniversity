package com.housecumm.housecum.model.service.adminData;

import com.housecumm.housecum.model.entity.adminData.AdminData;
import com.housecumm.housecum.model.entity.adminData.AdminDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminDataServiceImpl implements AdminDataService {

    @Autowired
    private AdminDataRepository adminDataRepository;

    @Override
    public List<AdminData> getAllAdminDate() {
        return adminDataRepository.findAll();
    }

    @Override
    public void saveAdminData(AdminData adminData) {
        adminDataRepository.save(adminData);
    }

    @Override
    public AdminData getAdminData(int id) {
        AdminData adminData = null;
        Optional<AdminData> optionalAdminData = adminDataRepository.findById(id);
        if (optionalAdminData.isPresent()) {
            adminData = optionalAdminData.get();
        }
        return adminData;
    }

    @Override
    public void deleteAdminData(int id) {
        adminDataRepository.deleteById(id);
    }
}
