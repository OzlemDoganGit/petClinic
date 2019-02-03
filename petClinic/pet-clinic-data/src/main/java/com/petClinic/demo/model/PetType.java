package com.petClinic.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name ="types") 
public class PetType extends BaseEntity{

	@Column(name ="name")
	private String name;
	
	@OneToMany(mappedBy="petType")
	private Set <Pet> pets = new HashSet();

	public PetType() {
	}

	public PetType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PetType [name=" + name + "]";
	}
	
	
}