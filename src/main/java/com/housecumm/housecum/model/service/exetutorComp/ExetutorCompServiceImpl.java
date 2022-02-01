package com.housecumm.housecum.model.service.exetutorComp;

import com.housecumm.housecum.model.entity.exetutorComp.ExetutorComp;
import com.housecumm.housecum.model.entity.exetutorComp.ExetutorCompRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExetutorCompServiceImpl implements ExetutorCompService{

    @Autowired
    private ExetutorCompRepository exetutorCompRepository;

    @Override
    public List<ExetutorComp> getAllExetutorComp() {
        return exetutorCompRepository.findAll();
    }

    @Override
    public void saveExetutorComp(ExetutorComp exetutorComp) {
        exetutorCompRepository.save(exetutorComp);
    }

    @Override
    public ExetutorComp getExetutorComp(int id) {
        ExetutorComp exetutorComp = null;
        Optional<ExetutorComp> optionalExetutorComp = exetutorCompRepository.findById(id);
        if (optionalExetutorComp.isPresent()) {
            exetutorComp = optionalExetutorComp.get();
        }
        return exetutorComp;
    }

    @Override
    public void deleteExetutorComp(int id) {
        exetutorCompRepository.deleteById(id);
    }
}
