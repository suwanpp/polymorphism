package com.ohgiraffers.polymorphism;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        // 실행상태
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
            // 책 종류 입력
            System.out.println("책의 종류를 선택하세요 : ");
            System.out.println("1. 전자책, 2. 오디오북, 3. 만화책. 4. 종료 ");
            System.out.print("선택 1 / 2 / 3 / 4 : ");
            int num = sc.nextInt();

            if(num == 4){
                running = false;
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 책 이름, 저자 입력
            System.out.print("책 제목을 입력하세요 : ");
            String title = sc.next();
            System.out.print("책 저자를 입력하세요 : ");
            String author = sc.next();

            // 책 객체 생성
            Book book = null;
            switch (num) {
                case 1:
                    book = new EBook();
                    break;
                case 2:
                    book = new AudioBook();
                    break;
                case 3:
                    book = new ComicBook();
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    continue;
            }

            // 제목, 저자 설정
            book.setTitle(title);
            book.setAuthor(author);

            // 동작
            System.out.println("실행할 동작을 선택하세요 : ");
            System.out.println("1. 읽기");
            System.out.println("2. 북마크");
            System.out.println("3. 공유");
            if (book instanceof EBook) {
                System.out.println("4. 밝기 조절");
            }
            if (book instanceof AudioBook) {
                System.out.println("4. 재생 속도 조절");
            }
            if (book instanceof ComicBook) {
                System.out.println("4. 그림 감상");
            }
            System.out.print("선택 1 / 2 / 3 / 4 : ");
            int action = sc.nextInt();

            // 작업 수행
            switch (action) {
                case 1:
                    book.read();
                    break;
                case 2:
                    book.bookmark();
                    break;
                case 3:
                    book.share();
                    break;
                case 4:
                    if (book instanceof EBook) {
                        ((EBook) book).Brightness();
                    } else if (book instanceof AudioBook) {
                        ((AudioBook) book).Speed();
                    } else {
                        ((ComicBook) book).Illustrations();
                    }
                    break;
                default:
                    System.out.println("잘못된 선택입니다");
            }
            System.out.println();
        }
    }
}