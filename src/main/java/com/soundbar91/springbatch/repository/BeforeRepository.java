package com.soundbar91.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soundbar91.springbatch.entity.BeforeEntity;

public interface BeforeRepository extends JpaRepository<BeforeEntity, Long> {
}
