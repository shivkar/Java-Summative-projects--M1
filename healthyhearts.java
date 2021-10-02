/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class healthyhearts {public static void main(String[] args) {
     Scanner sk = new Scanner(System.in);

     System.out.println("What is your age? ");
     String age = sk.nextLine();
     
      int intage = Integer.parseInt(age);//convert string to int
      double dubage = Double.parseDouble(age);//
      int maxheartRate ;
      maxheartRate = 220 - intage;
      
     float targetHrzone1= maxheartRate * 0.50f;//
     float targetHrzone2 = maxheartRate * 0.85f;
     int endingHRZone = Math.round(targetHrzone2);// to conver decimal to nearest value 
     int startingHRZone = Math.round(targetHrzone1);
     
     System.out.println("Your maximum heart rate should be "+ maxheartRate+ " beats per minute. ");
     
      System.out.println("Your target HR Zone is  "+ startingHRZone + "-" + endingHRZone + " beats per minute. ");
}}
