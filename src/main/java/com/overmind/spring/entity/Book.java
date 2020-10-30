package com.overmind.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @description:
 * @author: chenjy
 * @create: 2020-10-30 13:43
 */
public class Book {

    private Integer id;

    private String name;

    private double price;

    private List<String> authors;

    private Map<String,Object> info;

    private Properties info2;

    public Book(){

    }

    public Book(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public Properties getInfo2() {
        return info2;
    }

    public void setInfo2(Properties info2) {
        this.info2 = info2;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", authors=" + authors +
                ", info=" + info +
                ", info2=" + info2 +
                '}';
    }
}
