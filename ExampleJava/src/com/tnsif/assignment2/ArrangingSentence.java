package com.tnsif.assignment2;
import java.util.Arrays;
public class ArrangingSentence {
	private String[] sentence;

	

	public String[] getSentence() {
		return sentence;
	}
	public void setSentence(String[] sentence) {
		this.sentence = sentence;
	}
	public ArrangingSentence() {
		
	}
	public ArrangingSentence(String[] sentence) {
		super();
		this.sentence = sentence;
	}
	String[] c = sentence.split(" ");
	public void display()
	{
		for (String c: sentence) {
		    char[] letters = c.toCharArray();
		    java.util.Arrays.sort(letters);
		    System.out.println((new String(letters)).append(" "));
		
		}
	}
}