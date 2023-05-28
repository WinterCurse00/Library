package com.dcgteam.training.library.service;

import com.dcgteam.training.library.entity.BookEntity;
import com.dcgteam.training.library.mapper.MapperUtils;
import com.dcgteam.training.library.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dcgteam.training.library.model.Book;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    MapperUtils mapperUtils;

    public List<Book> getAll() {

        List<BookEntity> books = bookRepository.findAll();

        return books.stream().map(bookEntity -> mapperUtils.getBook(bookEntity) ).toList();
    }
}
