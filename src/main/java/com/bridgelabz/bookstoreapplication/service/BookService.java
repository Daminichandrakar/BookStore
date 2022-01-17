package com.bridgelabz.bookstoreapplication.service;

import com.bridgelabz.bookstoreapplication.dto.BookDto;
import com.bridgelabz.bookstoreapplication.entity.Book;
import com.bridgelabz.bookstoreapplication.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.*;
import java.util.stream.IntStream;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ModelMapper modelMapper;
    String line = "";

    public String  saveBookData(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new
                    FileReader("src/main/resources/books_data.csv"));
            while ((line=bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Book bookEntity = new Book();
                bookEntity.setBookAuthorName(data[1].replaceAll("'", ""));
                bookEntity.setBookName(data[2].replaceAll("'", ""));
                bookEntity.setQuantity(data[3]);
                bookEntity.setBookImage(data[4]);
                bookEntity.setBookPrice(data[5]);
                IntStream.range(7, data.length - 1).forEach(column -> data[6] += "," + data[column]);
                bookEntity.setBookDescription(data[6]);
                bookRepository.save(bookEntity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Added";
    }
}
