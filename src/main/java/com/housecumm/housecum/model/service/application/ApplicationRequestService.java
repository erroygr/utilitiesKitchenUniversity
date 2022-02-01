package com.housecumm.housecum.model.service.application;

import com.housecumm.housecum.model.entity.application.ApplicationRequest;

import java.util.List;

public interface ApplicationRequestService {

    List<ApplicationRequest> getAllApplication();
    void saveApplication(ApplicationRequest applicationRequest);
    ApplicationRequest getApplication(int id);
    void deleteApplication(int id);
}
