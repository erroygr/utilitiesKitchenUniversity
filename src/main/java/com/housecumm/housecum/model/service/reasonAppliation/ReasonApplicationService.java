package com.housecumm.housecum.model.service.reasonAppliation;

import com.housecumm.housecum.model.entity.reasonAppliation.ReasonApplication;

import java.util.List;

public interface ReasonApplicationService {

    List<ReasonApplication> getAllReasonApplication();
    void saveReasonApplication(ReasonApplication reasonApplication);
    ReasonApplication getReasonApplication(int id);
    void deleteReasonApplication(int id);

}
