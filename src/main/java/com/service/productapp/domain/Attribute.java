package com.service.productapp.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Attribute {

	private String id;
	private String name;
	private String value;
}
