package com.housecumm.housecum.model.service.statusApplication;

import com.housecumm.housecum.model.entity.localDormitory.LocationDormitory;
import com.housecumm.housecum.model.entity.statusApplication.StatusApplication;

import java.util.List;

public interface StatusApplicationService {

    List<StatusApplication> getAllStatusApplication();
    void saveStatusApplication(StatusApplication statusApplication);
    StatusApplication getStatusApplication(int id);
    void deleteStatusApplication(int id);
}
