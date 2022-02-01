package com.housecumm.housecum.model.service.kindApplication;

import com.housecumm.housecum.model.entity.kindApplication.KindApplication;
import com.housecumm.housecum.model.entity.kindApplication.KindApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KindApplicationServiceImpl implements KindApplicationService{

    @Autowired
    private KindApplicationRepository applicationRepository;

    @Override
    public List<KindApplication> getAllKindApplication() {
        return applicationRepository.findAll();
    }

    @Override
    public void saveKindApplication(KindApplication kindApplication) {
        applicationRepository.save(kindApplication);
    }

    @Override
    public KindApplication getKindApplication(int id) {
        KindApplication kindApplication = null;
        Optional<KindApplication> optionalKindApplication = applicationRepository.findById(id);
        if (optionalKindApplication.isPresent()) {
            kindApplication = optionalKindApplication.get();
        }
        return kindApplication;
    }

    @Override
    public void deleteKindApplication(int id) {
        applicationRepository.deleteById(id);
    }
}
