package com.ohgiraffers.polymorphism;

class AudioBook extends Book {

    @Override
    public void read() {
        System.out.println("오디오북 \"" + title + "\"를 듣고 있습니다.");
    }

    @Override
    public void bookmark() {
        System.out.println("오디오북 \"" + title + "\"의 재생 위치를 저장했습니다.");
    }

    @Override
    public void share() {
        System.out.println("오디오북 \"" + title + "\"의 재생 링크를 다른 사람과 공유했습니다.");
    }

    // AudioBook 고유 메서드
    public void Speed() {
        System.out.println("오디오북의 재생 속도를 조정하고 있습니다.");
    }
}