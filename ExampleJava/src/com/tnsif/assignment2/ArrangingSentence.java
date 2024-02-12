package com.tnsif.assignment2;
import java.util.*; 
public class ArrangingSentence {
	public static void main(String []args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String sentence;
		sentence=s1.nextLine();

	if(isValid(sentence))
	{
		System.out.println("Invalid input");
	}
	else
	{
		String[] word=sentence.split(" ");
		StringBuilder rs=new StringBuilder();
		for(String letter:word)
		{
			char[] ch=letter.toCharArray();
			Arrays.sort(ch);
			rs.append(ch).append(" ");
		}
		System.out.println(rs);
	}
	}
	private static boolean isValid(String sentence)
	{
		for(char c:sentence.toCharArray())
		{
			if(c ==' ' && Character.isLowerCase(c))
			{
				return true;
			}
			
		}
		return false;
	}
	
}

