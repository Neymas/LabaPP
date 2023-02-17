package laba1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final String PASSWORD_TEMPLATE = "MAS";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль для сравнения:");

        String text = scanner.next();

        if (text.equals(PASSWORD_TEMPLATE)) {
            System.out.println("Пароль верный!");
        } else {
            System.out.println("Пароль неверный!");
        }

        scanner.close();
    }
}