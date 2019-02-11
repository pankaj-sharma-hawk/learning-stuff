package com.auth0.samples.authapi.springbootauthupdated.institute.repository;

import com.auth0.samples.authapi.springbootauthupdated.institute.model.PlayerPositionDataSet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pankaj on 02,2019
 */
public interface PlayerPositionDataSetRepo extends JpaRepository<PlayerPositionDataSet,Long> {
}
