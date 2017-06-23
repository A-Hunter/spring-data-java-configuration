package com.spring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ghazi Naceur on 23/06/2017.
 */
@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public void save(Book book){
        repository.save(book);
    }
}
