package com.training;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {

	@Test
	@DisplayName(value = "Test the GetMessage return a string of length 8 character")
	void testMaxLength() {
		Greeting getObj=new Greeting();
		int actual=getObj.getMessage().length();
		int expected=5;
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName(value = "test the birthday wish method does not return null")
	void testBirthdayWish() {
		Greeting grtObj=new Greeting();
		String actual=grtObj.birthdayWish("loki");
		assertNotNull(actual);
		//assertNull(actual);green when we pass null instead "loki"
	}
	
	@Test
	@DisplayName(value = "Test Birthday wish method should return happy birthday with user name suffixed")
	void testSuffixedMessage() {
		Greeting grtObj=new Greeting();
		String name="loki mass";
		String actual=grtObj.birthdayWish(name);
		String expected="Happy Birth Day "+name;
		assertEquals(expected,actual);
	}
	
	
	
	
	
}
