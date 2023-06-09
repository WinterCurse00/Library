package com.dcgteam.training.library.mapper;

import com.dcgteam.training.library.entity.BookEntity;
import com.dcgteam.training.library.model.Book;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MapperUtils {
    ModelMapper modelMapper;



    public Book getBook(BookEntity bookEntity){

        return modelMapper.map(bookEntity, Book.class);
    }

}
