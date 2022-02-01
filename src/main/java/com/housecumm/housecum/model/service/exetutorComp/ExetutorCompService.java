package com.housecumm.housecum.model.service.exetutorComp;

import com.housecumm.housecum.model.entity.exetutorComp.ExetutorComp;

import java.util.List;

public interface ExetutorCompService {

    List<ExetutorComp> getAllExetutorComp();
    void saveExetutorComp(ExetutorComp exetutorComp);
    ExetutorComp getExetutorComp(int id);
    void deleteExetutorComp(int id);
}
