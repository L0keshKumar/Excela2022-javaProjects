package com.training;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.model.Book;
import com.training.service.BookService;

public class BookServiceTest {
	BookService service=null;
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"Called");
	}
	@BeforeEach
	public void setUp(TestInfo info) {
		System.out.println(info.getDisplayName()+"Called");

		service=new BookService();
	}

	//Book
		@Test
		@DisplayName(value = "Get Method  Should not return null value")
		void testGetBookList() {
			//BookService service=new BookService();
			
			Object actual=service.getBookList();
			assertNotNull(actual);
			//assertNull(actual);
		}
		@DisplayName(value = "add Method should return 1 for adding else 0")
		@Test
		void testAddBook() {
			//BookService service=new BookService();
			Book book=new Book(101, "Laip of Baki", 100.0);
			int actual=service.addBook(book);
			assertEquals(1, actual);
		}
		@Test
		@DisplayName(value = "add method should not accept duplicate values")
		void testDuplicatInBookList() {
			//BookService service=new BookService();
			Book book1=new Book(103, "Laip of Baki", 100.0);
			Book book2=new Book(103, "Laip of Baki", 100.0);
			int value=service.addBook(book1);
			int actual=service.addBook(book2);
			assertEquals(0, actual);
			
//			assertAll("Testing Add Book",
//					()->assertEquals(1,service.addBook(new Book(1, "Laip of Baki", 100.0))),
//					()->assertEquals(0,service.addBook(new Book(1, "Laip of Baki", 100.0)))
//					);
		}
		
		@Test
		@DisplayName(value = "if the element is not found in the collection remove book method should throw RunTimeException 'Invalid Element'")
		//@Disabled("ka na kf akf qwfpioj")
		void testRemoveBook() {
			//Book book=new Book(103, "Laip of Baki", 100.0);
			Book book=new Book(3, "Laip of Baki", 100.0);
			//BookService service=new BookService();
			//boolean result=service.removeBook(book);
			
			Throwable e=assertThrows(RuntimeException.class,
					()-> service.removeBook(book));
			assertEquals("Invalid Element",e.getMessage());
			
		}
		
		@DisplayName(value="Test if geetBook Method has value Head First Java in BestBookList")
		@ParameterizedTest
		@ValueSource(ints = {0,1,2})
		void testGeetBook(int idxPos) {
			//System.out.println(System.getProperty("os.name"));
//			assumeTrue(System.getProperty("os.name").equals("unix"));
			assumeTrue(System.getProperty("os.name").equals("Windows 8.1"));
			assertEquals("Head First Java", service.getBestBooks().get(idxPos));
		}
}
