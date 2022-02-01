package com.housecumm.housecum.model.service.TipeActivity;

import com.housecumm.housecum.model.entity.TipeActivity.TipeActivity;
import com.housecumm.housecum.model.entity.localDormitory.LocationDormitory;

import java.util.List;

public interface TipeActivityService {

    List<TipeActivity> getAllTipeActivity();
    void saveTipeActivity(TipeActivity tipeActivity);
    TipeActivity getTipeActivity(int id);
    void deleteTipeActivity(int id);
}
