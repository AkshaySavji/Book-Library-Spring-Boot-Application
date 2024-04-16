package com.springboot.library.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.library.Model.Books;

public interface BookRepository extends CrudRepository<Books, Integer> {

}
