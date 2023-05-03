package com.ohgiraffers.method_question;

public class Calculator {
    public static void checkMethod(){
        System.out.println("checkMethod 메소드 확인.");
    }
    public int sum1to10() {

        int result = 0;
        for (int i = 1; i < 11; i++) {
            result += i;
        }

        return result;
    }

    public void checkMaxNumber(int x, int y){
        if(x > y) System.out.println("두 수 중 큰 수는 " + x + "이다.");
        else System.out.println("두 수 중 큰 수는 " + y + "이다.");
    }

    public int sumTwoNumber(int x, int y){
        int result = x + y;

        return result;
    }

    public int minusTwoNumber(int x, int y){
        int result = x - y;

        return result;
    }
}
