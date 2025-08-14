package com.impulsofirme.mssucursales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impulsofirme.mssucursales.entity.Office;
import com.impulsofirme.mssucursales.repository.OfficeRepository;

@Service
public class OfficesService {
    @Autowired
    private OfficeRepository officeRepository;

    public List<Office> getAllOffices() {
        return officeRepository.findAll();
    }
}