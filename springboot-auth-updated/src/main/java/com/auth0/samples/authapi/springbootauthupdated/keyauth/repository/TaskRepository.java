package com.auth0.samples.authapi.springbootauthupdated.keyauth.repository;

import com.auth0.samples.authapi.springbootauthupdated.keyauth.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}