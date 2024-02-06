package com.tnsif.assignment2;

public class Sentence {
	private String sentence1;
	

	private String sentence2;
	public String getSentence1() {
		return sentence1;
	}
	public void setSentence1(String sentence1) {
		this.sentence1 = sentence1;
	}
	public String getSentence2() {
		return sentence2;
	}
	public void setSentence2(String sentence2) {
		this.sentence2 = sentence2;
	}
	public Sentence() {
		
	}
	public Sentence(String sentence1, String sentence2) {
		
		this.sentence1 = sentence1;
		this.sentence2 = sentence2;
	}
	
	public void display()
	{
		if(sentence1.contains(sentence2))
		System.out.println(sentence2+ "\033[0;1m is present in the sentence");
		else
		{
			System.out.println(sentence2+ "\033[0;1m is not present in the sentence");
		}
	}

}
