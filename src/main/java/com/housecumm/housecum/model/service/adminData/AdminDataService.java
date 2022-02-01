package com.housecumm.housecum.model.service.adminData;

import com.housecumm.housecum.model.entity.adminData.AdminData;

import java.util.List;

public interface AdminDataService {

    List<AdminData> getAllAdminDate();
    void saveAdminData(AdminData adminData);
    AdminData getAdminData(int id);
    void deleteAdminData(int id);
}
