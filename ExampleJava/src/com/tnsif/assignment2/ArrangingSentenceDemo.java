package com.tnsif.assignment2;
import java.util.Scanner;
import java.util.*;

 public class   ArrangingSentenceDemo{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the sentence");
         String sentence = sc.nextLine();
         sc.close();
 
         if (!isValid(sentence)) {
             System.out.println(sentence + " is an invalid input");
         } else {
             String[] words = sentence.split(" ");
             StringBuilder result = new StringBuilder();
             for (String word : words) {
                 char[] chars = word.toCharArray();
                 Arrays.sort(chars);
                 result.append(new String(chars)).append(" ");
             }
             System.out.println(result.toString().trim());
         }
     }
 
     private static boolean isValid(String sentence) {
         for (char c : sentence.toCharArray()) {
             if (c != ' ' && !Character.isLowerCase(c)) {
                 return false;
             }
        }
        return true;
     }
 }
 