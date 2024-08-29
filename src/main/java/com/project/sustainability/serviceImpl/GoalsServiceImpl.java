package com.project.sustainability.serviceImpl;

import com.project.sustainability.exception.SupplierNotFoundException;
import com.project.sustainability.model.SupplierModel;
import com.project.sustainability.repository.SupplierRepo;
import com.project.sustainability.service.GoalsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GoalsServiceImpl implements GoalsService {
    @Autowired
    private SupplierRepo supplierRepo;

    @Override
    public List<SupplierModel> getSupplierById(String supplierId) {
        log.info("Fetching SupplierModel with ID: {}", supplierId);
        List<SupplierModel> supplierModel = supplierRepo.findBySupplierId(supplierId);
        if (supplierModel == null) {
            log.error("SupplierModel with ID: {} not found", supplierId);
            throw new SupplierNotFoundException(supplierId);
        }
        log.info("SupplierModel with ID: {} found", supplierId);
        return supplierModel;
    }
}