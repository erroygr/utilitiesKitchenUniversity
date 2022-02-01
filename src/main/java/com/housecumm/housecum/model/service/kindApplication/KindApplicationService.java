package com.housecumm.housecum.model.service.kindApplication;

import com.housecumm.housecum.model.entity.kindApplication.KindApplication;

import java.util.List;

public interface KindApplicationService {

    List<KindApplication> getAllKindApplication();
    void saveKindApplication(KindApplication kindApplication);
    KindApplication getKindApplication(int id);
    void deleteKindApplication(int id);

}
