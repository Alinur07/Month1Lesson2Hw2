package com.company;

import java.util.Scanner;

public class Main{



    public static void main (String [] args){



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи температуру");
         int tempp = scanner1.nextInt();
        if (age > 20 && age < 45 || temp > -20 && temp < 30) {
            System.out.println("можно идти гулять");
        } else if (age < 20 && temp > 0 && temp <28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 || temp > -10 && temp < 25) {
            System.out.println("Можно идти гулять");
        }else{
            System.out.println("Оставайтесь дома");
        }

    }

    private static int temp;
}

