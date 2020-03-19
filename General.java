package guessingGame;

import java.util.Arrays;
import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        int[] inputArray = {2, 5, 6, 7, 23, 4, 8, 12, 9};

        System.out.println(arrayLoop(inputArray));
        System.out.println(printingWords("Dee",3));
        //userGreeting("Alice");
        //fizzBuzz(45);


        /*
        Write a program that ask a user for their name
if the user's name is alice - print out welcome alice
if the user's name is bob - print out welcome bob
else continue to ask the user - what's your name?
         */
       Scanner scanner = new Scanner(System.in);


            Boolean checker=true;
            while (checker) {
                System.out.println("What is your name;");
                String name = scanner.nextLine();
                if (name.equals("Alice") || name.equals("Bob")) {
                    System.out.println("Welcome " + name);
                    checker = false;
                }


            }
    }

    public static void fizzBuzz(int input) {

        for (int x = input; x >= 1; x--) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);

            }
        }
    }


    //Array
/*
  Using a loop, sort and extract the Even numbers from an array of integers and return delimited string.
Example:   Below will be the input passed as a parameter when the method is called/invoked
//int[] input ={2, 5, 6, 7, 23, 4, 8, 12, 9};
Below will be the output if your code works as expected
Output =  2, 4, 6, 8, 12
 */

    public static String arrayLoop(int[] inputArray) {
        //array check if even output as string in ascending order
        String finOutput="";
       Arrays.sort(inputArray);
        for (int i = 0; i<=inputArray.length-1; i++) {
            if(inputArray[i]%2==0){

               finOutput+=inputArray[i]+",";

            }
        }
return finOutput.substring(0,10);
    }
    /*
    Given a number n, print the string given the number of n times.
For example if I gave you a string like "Ha"  and i asked you to print "Ha" 3 times (int n)
you should print "HaHaHa".
Input/ Parameter
String str = "Ha";   - This is the argument passed in
int n =  3 ( This is the number of times you should return the String str also passed in as argument)
Therefore if String str = "Ha" and int n = 3 then output would be "HaHaHa"
You do NOT need to redeclare String str and int n.  Just use them!!!
Expected Input
"Ha"
Expected Output
"HaHaHa"
     */
    public static String printingWords(String word, int userNum) {
        //array check if even output as string in ascending order
String finString="";
for(int num = 0; num<userNum;num++ ){
    finString+=word;
}
return finString;
    }


}