package com.rgr.project.RGR_doc_design.webapp.repository;

import com.rgr.project.RGR_doc_design.entity.CustomerEntity;
import com.rgr.project.RGR_doc_design.entity.PackingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {
    @Query("select cs from CustomerEntity cs where cs.customerPhone =?1")
    CustomerEntity getCustomerById(String phone);

    CustomerEntity findCustomerByCustomerId(Integer id);

    CustomerEntity findCustomerByCustomerEmailAndCustomerPassword(String customerEmail, String customerPassword);
}
