package com.tejaswiniShopee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejaswiniShopee.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
