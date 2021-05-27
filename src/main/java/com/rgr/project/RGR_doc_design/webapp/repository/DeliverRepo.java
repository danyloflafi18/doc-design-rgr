package com.rgr.project.RGR_doc_design.webapp.repository;

import com.rgr.project.RGR_doc_design.entity.DeliveryEntity;
import com.rgr.project.RGR_doc_design.entity.PackingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeliverRepo extends JpaRepository<DeliveryEntity, Long> {
    @Query(value = "SELECT *, delivery_type FROM delivery d;",
            nativeQuery = true)
    List<DeliveryEntity> getAllDelivery();

    @Query("Select d from DeliveryEntity d where d.deliveryId = ?1")
    DeliveryEntity getDeliveryById(int id);
}
