package br.com.ciagatos.api.domain.commons.entities;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity {
    protected Date deletedAt;
    protected Date createdAt;
    protected Date updatedAt;
}
