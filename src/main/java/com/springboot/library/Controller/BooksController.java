package com.springboot.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.library.Model.Books;
import com.springboot.library.Service.BookService;

@RestController
public class BooksController {
	@Autowired
	private BookService bookService;

	@PostMapping("/savebook")
	public void saveBook(@RequestBody Books books) {
		System.out.println("Controller"+books.toString());
		bookService.saveBook(books);
	
	}
	
	@GetMapping("/getAllBooks")
	public List<Books> getAllBooks() {
		System.out.println("Get All");
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBookById/{bookId}")
	public Books getBookById(@PathVariable("bookId")int bookId) {
		return bookService.getBookById(bookId);
	}
	
	@DeleteMapping("/deleteById/{bookId}")
	public void deleteBookById(@PathVariable("bookId")int bookId) {
		bookService.deleteBookById(bookId);
	}
	
	@PutMapping("/updateBook")
	public void updateBook(@RequestBody Books book) {
		System.out.println("UPDATING....!!"+book.toString());
		bookService.updateBook(book);
	}
	
}





