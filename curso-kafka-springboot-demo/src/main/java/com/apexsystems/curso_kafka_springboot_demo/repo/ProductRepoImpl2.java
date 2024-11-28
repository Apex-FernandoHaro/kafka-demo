package com.apexsystems.curso_kafka_springboot_demo.repo;

import com.apexsystems.curso_kafka_springboot_demo.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("product2")
public class ProductRepoImpl2 implements IProductRepo {
    //PRACTICE 4.1
    @Override
    public void save(List<Product> products) {
        System.out.println("Mensaje mostrado desde ProductoRepoImpl 2");
        products.forEach(product -> System.out.println("Nombre producto: " + product.getName()));
    }
}