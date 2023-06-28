package com.dcgteam.training.library.controller;

import main.java.com.dcgteam.training.library.api.LibraryApi;
import main.java.com.dcgteam.training.library.model.Book;
import main.java.com.dcgteam.training.library.model.IdResponse;
import com.dcgteam.training.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Autowired
    BookService bookService;


    @Override
    public ResponseEntity<IdResponse> deleteApiV1BookId(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Book> getApiV1BookId(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> getApiV1Books() {
        return null;
    }

//    @Override
//    public ResponseEntity<List<MapperUtils>> getApiV1Books() {
//
//
//        return ResponseEntity.ok(bookService.getAll());
//    }

    @Override
    public ResponseEntity<IdResponse> postApiV1Books(Book book) {
        return null;
    }

    @Override
    public ResponseEntity<IdResponse> putApiV1BookId(Integer id, Book book) {
        return null;
    }

    @RequestMapping(value = "/test")
    public static String Test(){
        return "Salut";
    }

}
