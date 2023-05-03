package com.ohgiraffers.method_question;

public class Application {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        System.out.println("main() 구동 시작");
        cal.checkMethod();
        int sum = cal.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum);
        cal.checkMaxNumber(1,2);
        int sum2 = cal.sumTwoNumber(10, 20);
        System.out.println("입력된 두 수의 합은 : " + sum2);
        int minus = cal.minusTwoNumber(10, 5);
        System.out.println("입력된 두 수의 차는 : " +minus);
        System.out.println("main() 구동 종료");

    }
}
