package com.ecommerce.inventory.services;

import java.util.List;

import com.ecommerce.inventory.entities.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category getCategoryByName(String name);
	
	public void addCategory(Category category);
	
	public void addAllCategories(List<Category> categories);
	
	public void removeCategory();
	
	public void updateCategory(Long id);

}
