package com.springboot.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.library.Model.Books;
import com.springboot.library.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public void saveBook(Books books) {
		bookRepository.save(books);
	}
	
	public List<Books> getAllBooks() {
		List<Books> listOfBooks = (List<Books>) bookRepository.findAll();
		return listOfBooks;
	}
	
	public Books getBookById(int bookId) {
		 return bookRepository.findById(bookId).get();
	}
	
	public void deleteBookById(int bookId) {
		bookRepository.deleteById(bookId);
	}

	public void updateBook(Books book) {
		bookRepository.save(book);
	}

}
