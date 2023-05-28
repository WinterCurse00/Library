package com.dcgteam.training.library.mapper;

import com.dcgteam.training.library.entity.BookEntity;
import org.modelmapper.ModelMapper;
import com.dcgteam.training.library.model.Book;
import org.springframework.stereotype.Component;

@Component
public class MapperUtils {
    ModelMapper modelMapper;



    public Book getBook(BookEntity bookEntity){
       Book model = modelMapper.map(bookEntity, Book.class);

        return model;
    }

}
