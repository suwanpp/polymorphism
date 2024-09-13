package com.ohgiraffers.polymorphism;

abstract class Book {
    protected String title;
    protected String author;

    public Book() {
        this.title = "untitled";
        this.author ="unknown";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 공통 메서드
    public abstract void read();       // 읽기 기능
    public abstract void bookmark();   // 북마크 기능
    public abstract void share();      // 공유 기능
}