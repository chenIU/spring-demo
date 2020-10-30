package com.overmind.spring.entity;

import com.overmind.spring.entity.Book;

/**
 * @description:
 * @author: chenjy
 * @create: 2020-10-30 14:15
 */
public class BookFactory {

    public static Book getInstance(){
        return new Book();
    }
}
