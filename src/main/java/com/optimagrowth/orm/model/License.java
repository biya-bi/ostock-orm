package com.optimagrowth.orm.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="license")
public class License {
    @Id
    @Column(name="id", nullable = false)
    private UUID id;
    
    @Column(name = "description")
    private String description;

    @JoinColumn(name = "organization_id", nullable = false)
    @ManyToOne
    private Organization organization;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "license_type", nullable = false)
    private String licenseType;

    @Column(name = "comment")
    private String comment;
}
