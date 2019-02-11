package com.auth0.samples.authapi.springbootauthupdated.keyauth.repository;

import com.auth0.samples.authapi.springbootauthupdated.keyauth.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pankaj on 02,2019
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long> {

    ApplicationUser findByUsername(String userName);
}
