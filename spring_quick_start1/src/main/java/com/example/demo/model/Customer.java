package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data//getter setter to-string equals and hash-code
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	int id;
	String customerName;
}
