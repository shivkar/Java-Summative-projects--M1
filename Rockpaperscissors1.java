/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.rockpaperscissors1;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
 
public class Rockpaperscissors1 {public static void main(String[] args){
    
                       
                        System.out.println("Welcome to Rock, Paper, Scissors game!");
		        System.out.println("What is your choice? Enter Rock, Paper, or Scissors. To quit the game, enter quit. ");
			 Scanner input= new Scanner(System.in);//Initialize the Scanner and print a choice
                         String choice = input.nextLine();
                         choice = choice.toLowerCase();
		        int numtie = 0;
                        int numwin =0;
                        int numloss= 0;
			while(!choice.equals("quit")) 
                            {   
                        int choicenum = 0;
                        if(choice.equals("Rock"))
                        {choicenum = 1;}
			 else if(choice.equals("Paper")){choicenum = 2;}
                         else if(choice.equals("Scissors")){choicenum =3;}
                         else {while(choicenum ==0){System.out.println("Your choice isn't valid!");
                           choice = input.nextLine();
                            choice = choice.toLowerCase();
		         if(choice.equals("Rock")){choicenum =1;}
			 else if(choice.equals("Paper")){choicenum = 2;}
                         else if(choice.equals("Scissors")){choicenum =3;}
                         else  if(choice.equals("quit")) System.exit(0);}  }    
				
                          // computer generate random number
                         int computernum = (int)(Math.random()* 3) + 1;
                         if(computernum == 1) System.out.println("Computer chose Rock");
			 if(computernum == 2) System.out.println("Computer chose Paper");	
                          if(computernum == 3) System.out.println("Computer chose Scissors");
				//Convert the random number to a string using conditionals and print the opponent's move
				if(computernum == choicenum)
				
                                {System.out.println("It's a tie");
                    numtie++;}
                                else if(choicenum==1 && computernum ==3){System.out.println("you win!");
                    numwin++;}
                                else if(choicenum==3 && computernum ==2){System.out.println("you win!");
                    numwin++;}
                                else if(choicenum==2 && computernum ==1){System.out.println("you win!");
                             numwin++;}    
                                else {System.out.println("you lose.");
                    numloss++;}
                                
                System.out.println("wins:" + numwin+ "loses:" + numloss + "ties:" + numtie); }//print out number of wins, ties, and lose
	        if (choice.equals("N"))System.out.println("Thanks for playing Rock, Paper, Scissors!");
                if(choice.equals("Y")) System.out.println("Let's play again! "); 		

                System.out.println("What is your choice? Enter Rock, Paper, or Scissors. To quit the game, enter quit. ");
                choice = input.nextLine();
		choice = choice.toLowerCase();}}
