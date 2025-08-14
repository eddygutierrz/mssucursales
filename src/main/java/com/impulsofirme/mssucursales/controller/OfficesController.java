package com.impulsofirme.mssucursales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impulsofirme.mssucursales.entity.Office;
import com.impulsofirme.mssucursales.service.OfficesService;

@RestController
@RequestMapping("/api/offices")
public class OfficesController {
    @Autowired
    private OfficesService officesService;

    // Endpoint to get all offices
    @RequestMapping("/all")
    public List<Office> getAllOffices() {
        return officesService.getAllOffices();
    }
}