package com.coder.book.bootrestproject.bookservice;

import com.coder.book.bootrestproject.dao.BookRepository;
import com.coder.book.bootrestproject.entity.*;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    // private static List<Book> list = new ArrayList<Book>();
    // static {
    // list.add(new Book(1, "Java", "Programming Language"));
    // list.add(new Book(2, "Python", "Interprted Language"));
    // list.add(new Book(2, "C", "Functional programming Language"));
    // }

    @Autowired
    BookRepository repository;

    // getallbooks
    public List<Book> getAllBooks() {
        List<Book> booklist = (List<Book>) repository.findAll();
        return booklist;
    }

    // get Book by Id
    public Book getBook(int id) {

        // book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        // return book;

        Book book = repository.findById(id);

        return book;

    }

    // add book
    public Book addBookList(Book book) {
        Book b = repository.save(book);
        return b;
    }

    // update book list
    public void updateBookList(int id, Book book) {
        // list.forEach(book -> {
        // if (book.getId() == id) {
        // book.setName(b.getName());
        // book.setTitle(b.getTitle());
        // }
        // });
        book.setId(id);
        repository.save(book);
    }

    // delete book by id
    public void deleteBookById(int id) {
        // list = list.stream().filter((book) -> book.getId() !=
        // id).collect(Collectors.toList());
        repository.deleteById(id);

    }
}
