package com.project.sustainability.service;

import com.project.sustainability.model.SupplierModel;

import java.util.List;


public interface SupplierService {
    List<SupplierModel> getSupplierById(String supplierId);

}
