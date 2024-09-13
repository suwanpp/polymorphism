package com.ohgiraffers.polymorphism;

// 상속
class ComicBook extends Book {

    @Override
    public void read() {
        System.out.println("만화책 \"" + title + "\"을 읽고 있습니다.");
    }

    @Override
    public void bookmark() {
        System.out.println("만화책 \"" + title + "\"의 현재 페이지를 북마크했습니다.");
    }

    @Override
    public void share() {
        System.out.println("만화책 \"" + title + "\"의 특정 페이지를 다른 사람과 공유했습니다.");
    }

    // ComicBook 고유 메서드
    public void Illustrations() {
        System.out.println("만화책의 그림을 감상하고 있습니다.");
    }
}