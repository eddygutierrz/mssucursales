package com.impulsofirme.mssucursales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impulsofirme.mssucursales.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}