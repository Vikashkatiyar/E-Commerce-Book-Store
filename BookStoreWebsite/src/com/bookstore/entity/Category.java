package com.bookstore.entity;
// Generated 30-Apr-2023, 1:27:54 pm by Hibernate Tools 6.1.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Integer categoryId;
	private String name;
	private Set books = new HashSet(0);

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(String name, Set books) {
		this.name = name;
		this.books = books;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

}
