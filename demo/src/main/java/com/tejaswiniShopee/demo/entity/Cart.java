package com.tejaswiniShopee.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name="cartTbl")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	
	

}
