package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Имя человека: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String name2 = scan.nextLine();
        String name3 = scan.nextLine();
        String name4 = scan.nextLine();
        String name5 = scan.nextLine();

        ArrayList<String> userall = new ArrayList<>();

        userall.add(name);
        userall.add(name2);
        userall.add(name3);
        userall.add(name4);
        userall.add(name5);

        Iterator<String> iter = userall.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        System.out.println("Возраст человека ");
        Scanner scan2 = new Scanner(System.in);
        String age = scan2.nextLine();
        String age2 = scan2.nextLine();
        String age3 = scan2.nextLine();
        String age4 = scan2.nextLine();
        String age5 = scan2.nextLine();



        ArrayList<String> number = new ArrayList<>();

        number.add(age);
        number.add(age2);
        number.add(age3);
        number.add(age4);
        number.add(age5);

        Iterator<String> iter2 = number.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }


        System.out.println("________________");
        System.out.println("Имя и Возраст");
        System.out.println("________________");

        ArrayList<String> nameAge = new ArrayList<>();
        nameAge.add(name);
        nameAge.add(age5);
        nameAge.add(name2);
        nameAge.add(age4);
        nameAge.add(name3);
        nameAge.add(age3);
        nameAge.add(name4);
        nameAge.add(age2);
        nameAge.add(name5);
        nameAge.add(age);
        Collections.reverse(nameAge);
        Iterator<String> iter3 = nameAge.iterator();
        while (iter3.hasNext()){
            System.out.println(iter3.next());
        }

        System.out.println("________________");
        System.out.println("Сортировка по длине");
        Collections.sort(nameAge, Comparator.comparingInt(String::length));
        iter3 = nameAge.iterator();
        while (iter3.hasNext()){
            System.out.println(iter.next());
        }

        Collections.sort(nameAge, (s, t1) -> {

            if (s.length() < t1.length()) {
                return -1;
            } else if (s.length() > t1.length()) {
                return 11;
            } else {
                return 0;
            }
        });

    }
}
