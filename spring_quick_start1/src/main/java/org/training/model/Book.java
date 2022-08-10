package org.training.model;

import org.springframework.stereotype.Service;

@Service
public class Book {
	public int getDiscount(String bookName) {
		return 10;
	}
}
