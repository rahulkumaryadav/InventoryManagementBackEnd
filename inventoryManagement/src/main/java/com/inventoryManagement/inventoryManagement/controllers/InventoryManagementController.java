package com.inventoryManagement.inventoryManagement.controllers;


import com.inventoryManagement.inventoryManagement.entity.InventoryManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/inventoryManagement")
public class InventoryManagementController {




    @GetMapping
    public ResponseEntity<List<InventoryManagement>> getName(){
        List<InventoryManagement> inventoryManagementArrayList=new ArrayList<>();
        InventoryManagement inventoryManagement=new InventoryManagement();
        inventoryManagement.setPurchesRate(100L);
        inventoryManagement.setSaleRate(500L);
        inventoryManagementArrayList.add(inventoryManagement);
        return ResponseEntity.ok().body(inventoryManagementArrayList);
    }
}
