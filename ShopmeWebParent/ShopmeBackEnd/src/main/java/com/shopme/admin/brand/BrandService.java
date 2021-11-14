package com.shopme.admin.brand;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopme.common.entity.Brand;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository repo;
	
	public List<Brand> listAll() {
		// TODO Auto-generated method stub
		
		//Sort firstNameSorting =  Sort.by("name").ascending();
		
		//List<Brand> brandList = new ArrayList<>();
		//repo.findAll(firstNameSorting).forEach(brandList::add);
		return (List<Brand>)repo.findAll();
	
	}
}
