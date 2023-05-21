package com.programmingtechie.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * 这个类看起来跟 Product 一样，之所以分开设计是因为要把内部的模型和外部的 response 分开，减少耦合性，如果以后 Product 增加了敏感字段，也可以不对外暴露（即response）
 * 体现了 DTO 数据传输对象（Data Transfer Object）的设计模式，可以将数据从业务逻辑中解耦出来，使得不同模块之间的数据传输更加灵活和独立。
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
