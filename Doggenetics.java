/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class Doggenetics {public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random rGen = new Random();

        String dogName ;
       
        int startPercent = 100;
        int breedPercent = 0;

        System.out.println("What is your dog's name?");
        dogName = inputReader.nextLine();

        String[] breeds = {"St. Bernard", "Dramatic RedNosed Asian Pug", "King Doberman", "Chihuahua","Common Cur"};

        System.out.println(dogName + " is : ");

        for (int i = 0; i < 5; i++) {
            String breed = "";
            breed = breeds[i];// to select array name 
            if (i != 4) {
                breedPercent = rGen.nextInt(startPercent);
                startPercent -= breedPercent;
            } else {
                breedPercent = startPercent;

            }
            System.out.println( breedPercent + "% " + breed);

        }
        System.out.println("WOW, that is QUITE the dog!!");
    }

}
    

