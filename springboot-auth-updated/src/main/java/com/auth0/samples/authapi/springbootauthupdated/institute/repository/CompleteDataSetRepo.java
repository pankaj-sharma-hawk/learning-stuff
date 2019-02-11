package com.auth0.samples.authapi.springbootauthupdated.institute.repository;

import com.auth0.samples.authapi.springbootauthupdated.institute.model.CompleteDataSet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pankaj on 02,2019
 */
public interface CompleteDataSetRepo extends JpaRepository<CompleteDataSet,Long> {
    CompleteDataSet findByName(String playerName);
    List<CompleteDataSet> findByClub(String clubName);
}
