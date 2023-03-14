package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("ap/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto book=BookDto.builder().title("my first book title").build();

        List<BookDto>books= new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);
    }

}
