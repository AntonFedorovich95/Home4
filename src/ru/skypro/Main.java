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
        int yearstart = 1822;
        int yearend = 2122;
        for (i = yearstart; i <= yearend; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        for (int A = 1; A <= 30; A++) {
            if (A % 3 == 0 && A % 5 == 0) {
                System.out.println(A + ": Ping Pong");
            } else {
                if (A % 3 == 0) {
                    System.out.println(A + ": Ping");
                } else {
                    if (A % 5 == 0) {
                        System.out.println(A + ": Pong");
                    } else {
                        System.out.println(A + ":");
                    }

                }
            }
        }
        System.out.println();
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (i = 3; i < 11; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
        int age = 19;
        int salary = 58000;
        if (age < 23 && salary >= 80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 2) * 1.5) + " рублей");
        } else {
            if (age < 23 && salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 2) * 1.2) + " рублей");
            } else {
                if (age >= 23 && salary >= 80000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 3) * 1.5) + " рублей");
                } else {
                    if (age >= 23 && salary >= 50000) {
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ((salary * 3) * 1.2) + " рублей");
                    }
                }
            }
        }
        System.out.println();
        int Age = 25;
        int Salary = 60000;
        int wantedSum = 330000;
        int creditPeriod = 12;
        float baseRate = 10;
        float maximumPayment = Salary / 2;
        if (Age < 23) {
            baseRate++;
        } else if (Age < 30) {
            baseRate += 0.5;
        }
        if (Salary > 80000) {
            baseRate += 0.7;
        }
        float monthlyPayment = (wantedSum + (wantedSum / 100 * baseRate)) / creditPeriod;
        if (maximumPayment >= monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + maximumPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + maximumPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано.");
        }
    }
}