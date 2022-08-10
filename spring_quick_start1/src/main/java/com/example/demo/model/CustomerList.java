package com.example.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor//ArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Component
@Getter
public class CustomerList {
	List<Customer> custList;
}
