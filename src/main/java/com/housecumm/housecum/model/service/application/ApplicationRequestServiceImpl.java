package com.housecumm.housecum.model.service.application;

import com.housecumm.housecum.model.entity.application.ApplicationRequest;
import com.housecumm.housecum.model.entity.application.ApplicationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationRequestServiceImpl implements ApplicationRequestService {

    @Autowired
    private ApplicationRequestRepository applicationRequestRepository;

    @Override
    public List<ApplicationRequest> getAllApplication() {
        return applicationRequestRepository.findAll();
    }

    @Override
    public void saveApplication(ApplicationRequest applicationRequest) {
        applicationRequestRepository.save(applicationRequest);
    }

    @Override
    public ApplicationRequest getApplication(int id) {
        ApplicationRequest applicationRequest = null;
        Optional<ApplicationRequest> optionalApplication = applicationRequestRepository.findById(id);
        if (optionalApplication.isPresent()) {
            applicationRequest = optionalApplication.get();
        }
        return applicationRequest;
    }

    @Override
    public void deleteApplication(int id) {
        applicationRequestRepository.deleteById(id);
    }
}
