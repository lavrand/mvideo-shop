package com.devd.spring.bookstorecatalogservice.repository;

import com.devd.spring.bookstorecatalogservice.repository.dao.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {
}
