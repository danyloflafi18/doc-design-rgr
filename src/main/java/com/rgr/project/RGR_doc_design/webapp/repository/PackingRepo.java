package com.rgr.project.RGR_doc_design.webapp.repository;

import com.rgr.project.RGR_doc_design.entity.FlowersEntity;
import com.rgr.project.RGR_doc_design.entity.PackingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PackingRepo extends JpaRepository<PackingEntity, Long> {
    @Query(value = "SELECT *, packing_type FROM packing p;",
            nativeQuery = true)
    List<PackingEntity> getAllTypeOfPacking();

    @Query("select p from PackingEntity p where p.packingId =?1")
    PackingEntity getPackingById(int id);
}
