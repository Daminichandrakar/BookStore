package com.bridgelabz.bookstoreapplication.service;

import com.bridgelabz.bookstoreapplication.dto.BookDto;
import com.bridgelabz.bookstoreapplication.entity.Book;
import com.bridgelabz.bookstoreapplication.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ModelMapper modelMapper;
    String line = "";

    public void saveBookData(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/books_data.csv"));
            while ((line=bufferedReader.readLine()) != null){
                  String [] data = line.split(",");
                  Book book = new Book();
//                  book.setId(Integer.valueOf(data[0]));
                  book.setAuthor(data[1]);
                  book.setTitle(data[2]);
                book.setImage(data[3]);
                book.setPrice(data[4]);
                book.setDescription(data[5]);
                System.out.println("books print"+book);
                bookRepository.save(book);
            }
        }catch (Exception e){
        }
    }











//    public List<Book> getAllList(){
//        return bookRepository.findAll();
//    }
//
//    public String addBook(BookDto bookDto) {
//        Book book = modelMapper.map(bookDto, Book.class);
//        bookRepository.save(book);
//        return "addBook";
//    }
//
//    public Book getById(int id){
//      return bookRepository.findById(id).get();
//    }

//    public List<Book> bookSearch(String name){
//        return bookRepository.findAllByNameStartsWith(name);
//    }
}
