package com.programmingtechie.inventoryservice.repository;

import com.programmingtechie.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    /**
     * 用于表示一个可能包含或不包含非空值的容器。它是用于解决空指针异常的常见问题。
     * Optional 可以包含一个非空值（存在值），也可以为空（没有值）。
     * 这个方法明确地表示了它可能找到匹配的库存信息，也可能没有找到。
     * 调用方可以使用 Optional 的方法，如 isPresent()、orElse()、orElseGet() 等来处理返回值，
     * 避免了空指针异常的风险，并能更加清晰地处理存在和不存在值的情况。
     * Tips: 视频里漏了参数：String skuCode
     */
    Optional<Inventory> findBySkuCode(String skuCode);
}
