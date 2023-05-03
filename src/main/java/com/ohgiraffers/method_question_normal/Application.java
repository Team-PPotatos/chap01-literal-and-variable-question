package com.ohgiraffers.method_question_normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker random = new RandomMaker();
        int random1 = random.randomNumber(10, 30);
        System.out.println(random1);

        String random2 = random.randomUpperAlphabet(10);
        System.out.println(random2);

        String RPS = random.rockPaperScissors();
        System.out.println(RPS);

        String toss = random.tossCoin();
        System.out.println(toss);
    }
}
