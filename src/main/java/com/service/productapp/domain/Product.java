package com.service.productapp.domain;

import java.util.List;
import java.util.Map;

import org.junit.runner.Result;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="product")
public class Product {

	private String name;
	@Id
	private String id;
	private String sourceCode;
	private String description;
	private List<Attribute> attributes;
	private Result result;
	private Map<String, String> mapdata;
}
