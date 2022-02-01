package com.housecumm.housecum.model.service.statusApplication;

import com.housecumm.housecum.model.entity.statusApplication.StatusApplication;
import com.housecumm.housecum.model.entity.statusApplication.StatusApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusApplicationServiceImpl implements StatusApplicationService{

    @Autowired
    private StatusApplicationRepository statusApplicationRepository;

    @Override
    public List<StatusApplication> getAllStatusApplication() {
        return statusApplicationRepository.findAll();
    }

    @Override
    public void saveStatusApplication(StatusApplication statusApplication) {
        statusApplicationRepository.save(statusApplication);
    }

    @Override
    public StatusApplication getStatusApplication(int id) {
        StatusApplication statusApplication = null;
        Optional<StatusApplication> optionalStatusApplication = statusApplicationRepository.findById(id);
        if (optionalStatusApplication.isPresent()) {
            statusApplication = optionalStatusApplication.get();
        }
        return statusApplication;
    }

    @Override
    public void deleteStatusApplication(int id) {
        statusApplicationRepository.deleteById(id);
    }
}
