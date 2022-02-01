package com.housecumm.housecum.model.service.reasonAppliation;

import com.housecumm.housecum.model.entity.reasonAppliation.ReasonApplication;
import com.housecumm.housecum.model.entity.reasonAppliation.ReasonApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReasonApplicationServiceImpl implements ReasonApplicationService{

    @Autowired
    private ReasonApplicationRepository reasonApplicationRepository;

    @Override
    public List<ReasonApplication> getAllReasonApplication() {
        return reasonApplicationRepository.findAll();
    }

    @Override
    public void saveReasonApplication(ReasonApplication reasonApplication) {
        reasonApplicationRepository.save(reasonApplication);
    }

    @Override
    public ReasonApplication getReasonApplication(int id) {
        ReasonApplication reasonApplication = null;
        Optional<ReasonApplication> optionalReasonApplication = reasonApplicationRepository.findById(id);
        if (optionalReasonApplication.isPresent()) {
            reasonApplication = optionalReasonApplication.get();
        }
        return reasonApplication;
    }

    @Override
    public void deleteReasonApplication(int id) {
        reasonApplicationRepository.deleteById(id);
    }
}
