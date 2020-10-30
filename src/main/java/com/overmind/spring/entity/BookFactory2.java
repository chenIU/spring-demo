package com.overmind.spring.entity;

import com.overmind.spring.entity.Book;

/**
 * @description:
 * @author: chenjy
 * @create: 2020-10-30 14:17
 */
public class BookFactory2 {

    public Book getInstance(){
        return new Book();
    }
}
