package com.auth0.samples.authapi.springbootauthupdated.institute.repository;

import com.auth0.samples.authapi.springbootauthupdated.institute.model.PlayerPersonalData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pankaj on 02,2019
 */
public interface PlayerPersonalDataRepo extends JpaRepository<PlayerPersonalData,Long> {
}
