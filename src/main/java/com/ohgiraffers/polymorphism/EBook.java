package com.ohgiraffers.polymorphism;

// 상속
class EBook extends Book {

    @Override
    public void read() {
        System.out.println("전자책 \"" + title  + "\"를 디지털 기기에서 읽고 있습니다.");
    }

    @Override
    public void bookmark() {
        System.out.println("전자책 \"" + title + "\"의 현재 페이지를 북마크했습니다.");
    }

    @Override
    public void share() {
        System.out.println("전자책 \"" + title + "\"의 링크를 다른 사람과 공유했습니다.");
    }

    // EBook 고유 메서드
    public void Brightness() {
        System.out.println("전자책 화면의 밝기를 조정하고 있습니다.");
    }
}