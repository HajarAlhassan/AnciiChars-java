package com.tts;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string To check the Digits and the Characters: ");
         text = scanner.nextLine();
        AsciiChars.printNumbers(text);
        AsciiChars.printUpperCase(text);
        AsciiChars.printLowerCase(text);
        System.out.println("What is your name:");
        text = scanner.nextLine();
        System.out.printf("Do you want to keep going with us %s : yes or y \n",text.toUpperCase());
          text=scanner.nextLine();
          String redCar;
          String pet;
          int luckyNum=0;
          String quarterback;
          int jersey=0;
          String modelDigit;
          String actor;
          int randomNum=0;
          int magicBall;
            while(text.equalsIgnoreCase("yes") || text.equalsIgnoreCase("y")) {
                System.out.println("Do you have a red car? (yes, no):");
                redCar = scanner.nextLine();
                System.out.println("What is the name of your pet? ");
                pet = scanner.nextLine();
                System.out.println("What is your lucky number?");
                luckyNum = scanner.nextInt();
                System.out.println("Do they have a favorite quarterback ?(yes,no)");
                quarterback = scanner.nextLine();
                quarterback = scanner.nextLine();
                if(quarterback.equalsIgnoreCase("yes")) {
                    System.out.println("What is your jersey number? ");
                    jersey = scanner.nextInt();
                }
                System.out.println("What is two-digit model year of their car? ");
                 modelDigit = scanner.nextLine();

                System.out.println("What is the first name of the your favorite actor or actress");
                    actor = scanner.nextLine();
                System.out.println("Enter a random number between 1 and 50:");
                randomNum = scanner.nextInt();
                while(randomNum<0 ||randomNum>50){
                    System.out.println("The number you entered is not between 1 and 50!");
                    System.out.println("Enter a random number between 1 and 50:");
                    randomNum = scanner.nextInt();
                }
                Random first = new Random();
               int x = first.nextInt();
               int y =  (int)(Math.random() * 64+1);
               int  z = (int)(Math.random() * 64+1);//the +1 to exclusive the 0 from the range
                int max=0;
                int min=0;
               if(x>y && x>z){
                    max=x;
                   if(y>z){
                       min=z;
                   }
                   else{
                       min=y;
                   }
               }
                if (jersey != 0) {
                    magicBall = jersey;
                } else {

                    magicBall = luckyNum * x;
                }
                if (magicBall < 1 || magicBall> 75) {
                    magicBall = Math.abs(magicBall - max);
                }


                int firstnum=(int) actor.charAt(0);
                int  secondnum=(int) pet.charAt(2);
                int thirdnum=Math.abs(luckyNum - min );
                int fourthnum=randomNum;
                int fifthnum=(int) actor.charAt(actor.length()-1);
               int[] numbers={firstnum,secondnum,thirdnum,fourthnum,fifthnum};
    for(int i=0;i<numbers.length;i++) {
      while (numbers[i] < 1 || numbers[i] > 65) {
          numbers[i] = Math.abs(numbers[i] - min);
      }
  }

     System.out.printf("lottery numbers :%d, %d, %d, %d, %d  Magic ball: %d\n",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],magicBall);
      System.out.println("Do you want to keep going with us : yes or y ");
        text=scanner.nextLine();
                text=scanner.nextLine();
  }
            }}



