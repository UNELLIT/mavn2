package ru.netology.services;

public class FreelanceServ {
    public int calculate (int income,int expenses, int threshold){
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money>= threshold){
                //отдыхает
                money -= expenses;
                money /= 3;
                counter++;
            }else {
                // работает
                money += income;
                money -= expenses;
            }
        }

        return counter;
    }
}
