package com.ecommerce.inventory.serviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.inventory.entities.Category;
import com.ecommerce.inventory.persistent.CategoryRepository;
import com.ecommerce.inventory.services.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public Category getCategoryByName(String name) {
		// Placeholder
		return new Category();
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public void addAllCategories(List<Category> categories) {
		categoryRepository.saveAll(categories);
	}

	public void removeCategory() {

	}

	public void updateCategory(Long id) {

	}

}
