package com.dcgteam.training.library.controller;

import com.dcgteam.training.library.model.Book;
import com.dcgteam.training.library.model.IdResponse;
import com.dcgteam.training.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LibraryController implements com.dcgteam.training.library.api.LibraryApi {

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


        return ResponseEntity.ok(bookService.getAll());
    }

    @Override
    public ResponseEntity<IdResponse> postApiV1Books(Book book) {
        return null;
    }

    @Override
    public ResponseEntity<IdResponse> putApiV1BookId(Integer id, Book book) {
        return null;
    }
}
