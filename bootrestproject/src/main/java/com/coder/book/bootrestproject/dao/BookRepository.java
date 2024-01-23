package com.coder.book.bootrestproject.dao;

import com.coder.book.bootrestproject.entity.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

    public Book findById(int id);
}
