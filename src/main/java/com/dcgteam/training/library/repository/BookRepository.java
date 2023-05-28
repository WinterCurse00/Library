package com.dcgteam.training.library.repository;


import com.dcgteam.training.library.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {



}
