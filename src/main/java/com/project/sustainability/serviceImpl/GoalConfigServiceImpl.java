package com.project.sustainability.serviceImpl;


import com.project.sustainability.model.GoalConfig;
import com.project.sustainability.repository.GoalConfigRepo;
import com.project.sustainability.service.GoalConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalConfigServiceImpl implements GoalConfigService {

    @Autowired
    private GoalConfigRepo goalConfigRepo;

    @Override
    public List<GoalConfig> getAllGoalConfigs() {
//        List<GoalConfig> list=goalConfigRepo.findAll();
//        System.out.println(list+"goals list");
//        return list;
        return goalConfigRepo.findAll();
    }

}