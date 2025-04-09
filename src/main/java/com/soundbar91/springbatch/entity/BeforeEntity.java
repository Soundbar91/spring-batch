package com.soundbar91.springbatch.entity;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class BeforeEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String username;
}
