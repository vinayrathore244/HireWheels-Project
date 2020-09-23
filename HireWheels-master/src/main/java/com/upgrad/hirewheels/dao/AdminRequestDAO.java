package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.AdminRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRequestDAO extends JpaRepository<AdminRequest, Integer> {
}
