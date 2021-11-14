package com.shopme.admin.brand;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shopme.admin.category.CategoryService;
import com.shopme.common.entity.Brand;
import com.shopme.common.entity.Category;


@Controller
public class BrandController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BrandController.class);

	@Autowired
	private BrandService service;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/brands")
	public String listAll(Model model) {
		List<Brand>listBrands = service.listAll();
		model.addAttribute("listBrands",listBrands);
		return "brands/brands";
	}
	
	@GetMapping("/brands/new")
	public String newBrand(Model model) {
		
		LOGGER.info("BrandController | newBrand is started");
		
		List<Category> listCategories = categoryService.listCategoriesUsedInForm();
		
		model.addAttribute("listCategories", listCategories);
		model.addAttribute("brand", new Brand());
		model.addAttribute("pageTitle", "Create New Brand");
		
		LOGGER.info("CategoryController | newBrand | listCategories : " + listCategories.toString());

		return "brands/brand_form";		
	}
}
