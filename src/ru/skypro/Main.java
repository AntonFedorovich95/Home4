package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 1; a <= 31; a = a + 7) {
            System.out.println("Сегодня пятница, " + a + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
        int b = 4;
        while (b <= 31) {
            System.out.println("Сегодня пятница, " + b + "-е число. Необходимо подготовить отчет.");
            b = b + 7;
        }
        System.out.println();
        int year = 1822;
        int year1 = 2122;
        for (i = 0; i <= year1; i = i + 79) {
            if (i > year) {
                System.out.println(i);
            }
        }
    }
}
