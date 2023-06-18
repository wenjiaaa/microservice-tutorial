package com.programmingtechie.inventoryservice.service;

import com.programmingtechie.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class InventoryService {
    private  final InventoryRepository inventoryRepository;
    //标注该方法是只读的，只读事务，那么任何对数据库的修改操作都将导致异常。
    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
        // Tips: 视频里漏了参数：String skuCode
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

}
