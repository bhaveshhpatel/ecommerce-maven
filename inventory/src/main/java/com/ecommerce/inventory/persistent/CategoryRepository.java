package com.ecommerce.inventory.persistent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.inventory.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
