package com.medhubnexus.project.Dao;

import com.medhubnexus.project.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
