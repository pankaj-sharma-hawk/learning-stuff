package com.auth0.samples.authapi.springbootauthupdated.institute.controller;

import com.auth0.samples.authapi.springbootauthupdated.institute.model.CompleteDataSet;
import com.auth0.samples.authapi.springbootauthupdated.institute.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
@RestController
@RequestMapping("/institute")
public class InstituteController {


    @Autowired
    private InstituteService instituteService;

    @GetMapping("/player_info/{playerName}")
    public CompleteDataSet getPlayerInfo(@PathVariable("playerName") String playerName){
        return instituteService.getPlayerInfo(playerName);
    }

    @GetMapping("/club_player")
    public List<CompleteDataSet> getClubPlayerList(@PathParam("club_name") String clubName){
        return instituteService.getClubPlayerList(clubName);
    }



}
