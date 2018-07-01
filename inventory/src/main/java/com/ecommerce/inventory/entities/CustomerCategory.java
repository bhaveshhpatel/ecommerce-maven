package com.ecommerce.inventory.entities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerCategory {
	private enum Type {
		ADULT, TEEN, KID, TOODLER;
	}
	private enum Gender {
		M, F, UNISEX;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Enumerated(EnumType.STRING)
	private Type type;
	@Enumerated(EnumType.STRING)
	private Gender gender;

}
