/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.summativesum;



/**
 *
 * @author SHIVALI
 */
public class summativesum {public static void main(String[] args) {

        int[] first = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] second = {999, -60, -77, 14, 160, 301};
        int[] third = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        sum(first);
        sum(second);
        sum(third);

        System.out.println("What You Should See ");

        System.out.println("#1 Array Sum: " + sum(first));
        System.out.println("#2 Array Sum: " + sum(second));
        System.out.println("#3 Array Sum: " + sum(third));
    }

    public static int sum(int[] first) {
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            sum = sum + first[i];}
            return sum;
        }}
