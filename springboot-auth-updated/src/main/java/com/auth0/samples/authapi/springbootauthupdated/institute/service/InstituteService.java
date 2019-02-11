package com.auth0.samples.authapi.springbootauthupdated.institute.service;

import com.auth0.samples.authapi.springbootauthupdated.institute.model.CompleteDataSet;
import com.auth0.samples.authapi.springbootauthupdated.institute.repository.CompleteDataSetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
@Service
public class InstituteService {

    @Autowired
    private CompleteDataSetRepo completeDataSetRepo;

    public CompleteDataSet getPlayerInfo(String playerName){
        CompleteDataSet result = completeDataSetRepo.findByName(playerName);
        return result;
    }

    public List<CompleteDataSet> getClubPlayerList(String clubName){
        return completeDataSetRepo.findByClub(clubName);
    }

}
