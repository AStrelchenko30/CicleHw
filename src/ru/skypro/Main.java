package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int a = 1;
        while (a <= 10) {
            if (a == 10) {
                System.out.println(a);
                break;
            }
            System.out.print(a + " ");
            a++;
        }
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
//задача 2
        for (int firstFriday = 4; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница " + firstFriday + "-е числа.Необходимо подготовить отчет");
        }
        // Задача 3
        int i=0;
        int ourYear=2022;
        int oldYear=ourYear-200;
        int newYear=ourYear+100;
        while (i<ourYear){
            i+=76;
            }
        int lastFall=i-(76*2);
        while (lastFall<=newYear){
            System.out.println(lastFall);
            lastFall+=76;
        }
        }
        }

