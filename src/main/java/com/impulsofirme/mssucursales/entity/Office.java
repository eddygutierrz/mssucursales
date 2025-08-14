package com.impulsofirme.mssucursales.entity;

import com.impulsofirme.mssucursales.components.AuditorAwareImpl;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "offices")
@Getter @Setter
public class Office extends AuditorAwareImpl{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
}