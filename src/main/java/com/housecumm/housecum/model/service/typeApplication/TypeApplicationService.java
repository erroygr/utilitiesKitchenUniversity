package com.housecumm.housecum.model.service.typeApplication;

import com.housecumm.housecum.model.entity.typeApplication.TypeApplication;

import java.util.List;

public interface TypeApplicationService {

    List<TypeApplication> getAllTypeApplication();
    void saveTypeApplication(TypeApplication typeApplication);
    TypeApplication getTypeApplication(int id);
    void deleteTypeApplication(int id);
}
