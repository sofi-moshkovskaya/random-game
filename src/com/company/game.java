package com.company;

import java.util.Scanner;

public class game {

    public void Game() {
        int a = 0;
        int b = 100;
        int atemp = 3;
        int random = a + (int) (Math.random() * b);

        Scanner in = new Scanner(System.in);

        System.out.println("Угадайте число от 1 до 100");
        for (int i = 0; i < atemp; i++) {
            System.out.println("Введите свое число:     ");
            int guess=in.nextInt();

            if (guess<random)
                System.out.println("Ваше число меньше загаданного");
            else if (guess>random)
                System.out.println("Ваше число больше загаданного");
            else
                System.out.println("ВЫ УГАДАЛИ!");
        }
    }
}