package com.service.productapp.controller;


import java.util.HashMap;
import java.util.Map;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.productapp.TestClass1;
import com.service.productapp.TestClass2;
import com.service.productapp.domain.Product;
import com.service.productapp.repository.ProductRepository;

@RestController
public class ProductResource {
	
	@Autowired
	ProductRepository report;

	@GetMapping("/test")
	public Result startTest() {
		System.out.println("Starting test....");
		JUnitCore jUnitCore = new JUnitCore();
		Result result = jUnitCore.run(TestClass1.class, TestClass2.class);
		
		System.out.println("Starting Completed....");
		Map<String, String> mapdata = new HashMap<String, String>();
		mapdata.put("testcase1", "12");
		mapdata.put("count", "10");
		mapdata.put("success", "5");
		mapdata.put("failure", "5");
		
		Product product  = new Product();
		product.setResult(result);
		product.setSourceCode("123");
		product.setMapdata(mapdata);
		report.insert(product);
		return result;
	}
}
