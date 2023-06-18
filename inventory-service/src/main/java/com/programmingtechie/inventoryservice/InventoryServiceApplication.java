package com.programmingtechie.inventoryservice;

import com.programmingtechie.inventoryservice.model.Inventory;
import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	/**
	 * CommandLineRunner 是 Spring Boot 提供的一个接口，用于在应用程序启动后执行一些初始化操作。
	 * 当应用程序启动时，Spring Boot 将自动执行 loadData 方法，并将 InventoryRepository 实例传递给它。
	 * 这样可以在应用程序启动时预加载一些初始化数据或执行一些初始操作。
	 * @param inventoryRepository
	 * @return
	 */
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(2000);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_13 red");
			inventory1.setQuantity(100);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
