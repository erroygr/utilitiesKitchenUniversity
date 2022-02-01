package com.housecumm.housecum.model.service.typeApplication;

import com.housecumm.housecum.model.entity.typeApplication.TypeApplication;
import com.housecumm.housecum.model.entity.typeApplication.TypeApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeApplicationServiceImpl implements TypeApplicationService{

    @Autowired
    private TypeApplicationRepository typeApplicationRepository;
    @Override
    public List<TypeApplication> getAllTypeApplication() {
        return typeApplicationRepository.findAll();
    }

    @Override
    public void saveTypeApplication(TypeApplication typeApplication) {
        typeApplicationRepository.save(typeApplication);
    }

    @Override
    public TypeApplication getTypeApplication(int id) {
        TypeApplication typeApplication = null;
        Optional<TypeApplication> optionalTypeApplication = typeApplicationRepository.findById(id);
        if (optionalTypeApplication.isPresent()) {
            typeApplication = optionalTypeApplication.get();
        }
        return typeApplication;
    }

    @Override
    public void deleteTypeApplication(int id) {
        typeApplicationRepository.deleteById(id);
    }
}
