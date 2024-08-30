package com.project.sustainability.controller;

import com.project.sustainability.model.SupplierModel;
import com.project.sustainability.repository.SupplierRepo;
import com.project.sustainability.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
@Autowired
SupplierRepo supplierRepo;
    @GetMapping("/{supplierId}")
    public ResponseEntity<List<SupplierModel>> getSupplierModelById(@PathVariable String supplierId) {
        log.info("Request received to get SupplierModel with ID: {}", supplierId);
       List<SupplierModel> supplierModel = supplierService.getSupplierById(supplierId);
        return new ResponseEntity<>(supplierModel, HttpStatus.OK);
    }

    @PostMapping("/insert")
    public  String insert(@RequestBody SupplierModel supplierModel){
        supplierRepo.save(supplierModel);
        return "inserted...";

    }
}













