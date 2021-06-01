package com.rgr.project.webapp.repository;

import com.rgr.project.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardRepo extends JpaRepository<CardEntity, Long> {
    @Query(value = "select * from rgr_flower_system.card cd where cd.card_id =?1", nativeQuery = true)
    CardEntity getAllById(int id);

    @Query(value = "select * from rgr_flower_system.card cd where cd.card_id =?1", nativeQuery = true)
    CardEntity getById(int id);
}