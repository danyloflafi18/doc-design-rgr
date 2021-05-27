package com.rgr.project.RGR_doc_design.webapp.repository;

import com.rgr.project.RGR_doc_design.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardRepo extends JpaRepository<CardEntity, Long> {
    @Query("select cd from CardEntity cd where cd.cardId =?1")
    CardEntity getAllById(int id);

    @Query("select cd from CardEntity  cd where cd.cardId =?1")
    CardEntity getById(int id);
}