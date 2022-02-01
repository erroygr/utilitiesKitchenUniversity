package com.housecumm.housecum.model.service.TipeActivity;

import com.housecumm.housecum.model.entity.TipeActivity.TipeActivity;
import com.housecumm.housecum.model.entity.TipeActivity.TipeActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipeActivityServiceImpl implements TipeActivityService{

    @Autowired
    private TipeActivityRepository tipeActivityRepository;

    @Override
    public List<TipeActivity> getAllTipeActivity() {
        return tipeActivityRepository.findAll();
    }

    @Override
    public void saveTipeActivity(TipeActivity tipeActivity) {
        tipeActivityRepository.save(tipeActivity);
    }

    @Override
    public TipeActivity getTipeActivity(int id) {
        TipeActivity tipeActivity = null;
        Optional<TipeActivity> optionalTipeActivity = tipeActivityRepository.findById(id);
        if (optionalTipeActivity.isPresent()) {
            tipeActivity = optionalTipeActivity.get();
        }
        return tipeActivity;
    }

    @Override
    public void deleteTipeActivity(int id) {
        tipeActivityRepository.deleteById(id);
    }
}
