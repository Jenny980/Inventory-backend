package com.company.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "category")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4310027227752446841L;
	
	private Long id;
	private String name;
	private String description;
	
}
