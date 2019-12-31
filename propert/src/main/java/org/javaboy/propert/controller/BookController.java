package org.javaboy.propert.controller;

import org.javaboy.propert.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private Book book;

    @RequestMapping("/book")
    public void book(){
        System.out.println(book);
    }
}
