
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-08         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program generates random     --
//-- numbers and add them to array and --
//-- find the maximum and minimum in it--
//---------------------------------------

// In this code, the user can even CHOOSE the length of the list!

import java.util.*;

public class MaxMin {

    public static Random randomNumber = new Random(); // Bring in an instance of Random
    public static Scanner scanner = new Scanner(System.in); // Bring in an instance of Scanner

    public static int maxer(List<Integer> numberList) { // Intro max finder function

        int max = numberList.get(0); // Intro max as the first place of the list

        for ( int count = 0; count < numberList.size(); count ++){ // goes through the list
            if (numberList.get(count) > max){ // If the elements is larger than the current max,
                max = numberList.get(count); //  it gets replaced
            }
        }

        return max; // shoots out max
    }

    public static int miner(List<Integer> numberList) { // Intro min finder function

        int min = numberList.get(0); // Intro min as the first place of the list

        for ( int count = 0; count < numberList.size(); count ++){ // goes through the list
            if (numberList.get(count) < min){ // If the elements is smaller than the current min,
                min = numberList.get(count); //  it gets replaced
            }
        }

        return min; // shoots out min

    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        // Asking for and storing data:
        System.out.println("How long do you want the list to be? \n");
        int userlength = scanner.nextInt();

        scanner.close(); // close scanner

        for (int counter = 1; counter < userlength; counter ++){ // for as long as the user wants

            myList.add(MaxMin.randomNumber.nextInt(99) + 1); // adds a random Int between 1 to 99 to the list

        }

        // output:
        System.out.println(myList);
        System.out.println("The max is: " + maxer(myList));
        System.out.println("The min is: " + miner(myList));
    }

    
}