package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBookList() throws Exception{
        return bookRepository.findAll();
    }

    public String saveBook(Book book) {
        book.setBname(book.getBname());
        book.setPrice(book.getPrice());
        book.setAuthor(book.getAuthor());
        bookRepository.save(book);
        return "success";
    }
}
