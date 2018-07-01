package com.ecommerce.inventory.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.inventory.entities.Category;
import com.ecommerce.inventory.exceptions.InvalidResourceException;
import com.ecommerce.inventory.services.CategoryService;

@RestController
@RequestMapping("/inventory/v1")
public class CategoryController {
	
	Log log = LogFactory.getLog(CategoryController.class);
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public List<Category> getCategories() {
		return categoryService.getAllCategories();
	}

	@PostMapping("/categories")
	public Category addCategory(@Valid @RequestBody final Category category) {
		try {
			categoryService.addCategory(category);
		} catch (Exception e) {
			throw new InvalidResourceException("Category", category);
		}
		return category;
	}

}
