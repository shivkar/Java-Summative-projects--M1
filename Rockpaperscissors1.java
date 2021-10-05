/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.rockpaperscissors1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SHIVALI
 * created on : 02.10.2021
 * last updated : 05.10.2021
 */
 
public class Rockpaperscissors1 {public static void main(String[] args){
                       
                        Scanner sk = new Scanner(System.in);
                        Scanner input= new Scanner(System.in);
                        int min = 1; int max = 10;
                        System.out.println("Welcome to Rock, Paper, Scissors game!");
                        System.out.println("How many rounds you want to play!");
                        int round = sk.nextInt();
                        if(round >= min && round <= max){System.out.println(" Play " + round + " rounds");
                        if(round > max) System.out.println(" Not a valid input ");
                        for(int i = 1 ; i <= round; i++)
                        {System.out.println("What is your choice? Enter Rock, Paper, or Scissors. To quit the game, enter quit. ");
			 //Initialize the Scanner and print a choice
                   
                        String choice = input.nextLine();
                        choice = choice.toLowerCase();
		        int numtie = 0;
                        int numwin =0;
                        int numloss= 0; 
                        while(!choice.equals("quit")) 
                        {int choicenum = 0; round++;
                        if(choice.equals("rock"))
                        {choicenum = 1;}
			 else if(choice.equals("paper")){choicenum = 2;}
                         else if(choice.equals("scissors")){choicenum =3;}
                         else {while(choicenum ==0){System.out.println("Your choice isn't valid!");
                            choice = input.nextLine();
                            choice = choice.toLowerCase();
		         if(choice.equals("rock")){choicenum =1;}
			 else if(choice.equals("paper")){choicenum = 2;}
                         else if(choice.equals("scissors")){choicenum =3;}
                         else  if(choice.equals("quit")) System.exit(0);}  }    
				
                          // computer generate random number
                         int computernum = (int)(Math.random()* 3) + 1;
                         if(computernum == 1) System.out.println("Computer chose rock");
			 if(computernum == 2) System.out.println("Computer chose paper");	
                          if(computernum == 3) System.out.println("Computer chose scissors");
				//Convert the random number to a string using conditionals and print the opponent's move
				if(computernum == choicenum)
				
                                {System.out.println("It's a tie");
                    numtie++;}
                                else if(choicenum==1 && computernum ==3)
                                {System.out.println("you win!");
                    numwin++;}
                                else if(choicenum==3 && computernum ==2)
                                {System.out.println("you win!");
                    numwin++;}
                                else if(choicenum==2 && computernum ==1)
                                {System.out.println("you win!");
                             numwin++;}    
                                else {System.out.println("you lose!");
                    numloss++;}
                                
                System.out.println("wins: " + numwin + " loses:" + numloss + " ties: " + numtie); //print out number of wins, ties, and lose
	        System.out.println ("Let's play again! "); 
                choice = input.nextLine();
		choice = choice.toLowerCase();       
                if (choice.equals("no"))System.out.println("Thanks for playing rock, paper, scissors!");
                String player1 ="Shivali";
                String player2 = "Computer";
                if( numwin > numloss)System.out.println("The winner is : " + player1);else System.out.println("The winner is : " + player2);
                if(choice.equals("yes")) System.out.println("What is your choice? Enter Rock, Paper, or Scissors. To quit the game, enter quit."); 		
                choice = input.nextLine();
		choice = choice.toLowerCase();}
                        if(choice.equals("quit")) //if user prints "quit", then quit program
                        System.exit(0);
              }}}}
