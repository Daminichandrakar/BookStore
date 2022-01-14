package com.bridgelabz.bookstoreapplication.controller;

import com.bridgelabz.bookstoreapplication.dto.BookDto;
import com.bridgelabz.bookstoreapplication.dto.ResponseDto;
import com.bridgelabz.bookstoreapplication.entity.Book;
import com.bridgelabz.bookstoreapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/book")
    public void getAllBookList(){
       bookService.saveBookData();
    }





















//    @GetMapping("/")
//    public ResponseEntity<ResponseDto> getAllBookList(){
//        ResponseDto responseDto = new ResponseDto("List Of Books", bookService.getAllList());
//        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<String> addBook(@RequestBody BookDto bookDto){
//         return new ResponseEntity<>(bookService.addBook(bookDto), HttpStatus.OK);
//    }
//
//    @RequestMapping("/{id}")
//    public ResponseEntity<ResponseDto> getBookById(@PathVariable int id){
//        ResponseDto responseDto = new ResponseDto("Book:", bookService.getById(id));
//        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
//    }
//
//    @RequestMapping("/search/{name}")
//    public ResponseEntity<ResponseDto> searchBookByName(@PathVariable String name){
//        ResponseDto responseDto = new ResponseDto("Book:", bookService.bookSearch(name));
//        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
//    }
}
