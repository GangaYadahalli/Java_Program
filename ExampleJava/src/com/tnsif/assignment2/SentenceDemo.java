package com.tnsif.assignment2;
import java.util.Scanner;
public class SentenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence1,sentence2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		Sentence s1=new Sentence();
		sentence1=sc.nextLine();
		System.out.println("Enter the word");
		sentence2=sc.nextLine();
		s1.setSentence1(sentence1);
		s1.setSentence2(sentence2);
		s1.display();
	}

}
