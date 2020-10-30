package com.overmind.spring;

import com.overmind.spring.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: chenjy
 * @create: 2020-10-30 13:49
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Book book = (Book) context.getBean("book");
        System.out.println(book);

        Book book2 = (Book) context.getBean("book2");
        System.out.println(book2);

        Book book3 = (Book) context.getBean("book3");
        System.out.println(book3);

        Book book4 = (Book) context.getBean("book4");
        System.out.println(book4);

        Book book5 = (Book) context.getBean("book5");
        System.out.println(book5);

        Book book6 = (Book) context.getBean("book6");
        System.out.println(book6);

        Book book7 = (Book) context.getBean("book7");
        System.out.println(book7);

        Book book8 = (Book) context.getBean("book8");
        System.out.println(book8);

        Book book9 = (Book) context.getBean("book9");
        System.out.println(book9);

        Book book10 = (Book) context.getBean("book10");
        System.out.println(book10);

        Book book11 = (Book) context.getBean("book11");
        System.out.println(book11);

        Book book12 = (Book) context.getBean("book12");
        System.out.println(book12);
    }
}
