package com.bridgelabz.bookstoreapplication.controller;

import com.bridgelabz.bookstoreapplication.dto.BookDto;
import com.bridgelabz.bookstoreapplication.dto.ResponseDto;
import com.bridgelabz.bookstoreapplication.entity.Book;
import com.bridgelabz.bookstoreapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/book")
@RestController
public class AdminController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public String loadCSV() {
       return bookService.loadCSV();
    }


    @GetMapping("/booklist")
    public List<Book> getAll() {
        return bookService.getAllBook();
    }

    @PostMapping("/addbook")
    public String add(@RequestBody BookDto bookDto) {
        return bookService.addBook(bookDto);
    }
}
