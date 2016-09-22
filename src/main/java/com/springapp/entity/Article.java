package com.springapp.entity;

/**
 * Created by holand on 16/9/18.
 */
public class Article {
    private String name;
    private int id;
    private String reader;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }
}
