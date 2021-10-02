/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.summativesum;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class summativesum {
       
        static int first[]= {1, 90, -33, -55, 67, -16, 28, -55, 15 };
        static int second[] = {999, -60, -77, 14, 160, 301 };
        static int third[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 };
       
       static int sum1(){ int sum1 =0;
       for(int i =0 ; i < first.length ; i++)sum1 += first[i]; return sum1;}
       static int sum2(){ int sum2 =0;
       for(int j =0 ; j < second.length ; j++)sum2 += second[j]; return sum2;}
       static int sum3(){ int sum3 =0;
       for(int k =0 ; k < third.length ; k++)sum3 += third[k]; return sum3;}
       
      public static void main(String[] args){System.out.println("What You Should See ");
      {System.out.println("#1 Array Sum: " + sum1());
       System.out.println("#2 Array Sum: " + sum2());
        System.out.println("#3 Array Sum: " + sum3());}
       }}
     


    
     
    

