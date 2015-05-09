package com.hascode.tutorial.service;

import java.util.UUID;

import com.hascode.tutorial.entity.Book;

public class BookBean {
	public Book create(final String title) {
		if (title == null) {
			throw new IllegalArgumentException("title must be set");
		}
		return new Book(title, UUID.randomUUID().toString().toUpperCase());
	}
}
