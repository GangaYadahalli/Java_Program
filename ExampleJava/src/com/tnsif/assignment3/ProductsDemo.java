package com.tnsif.assignment3;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ProductsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products pd=new Products();
		int choice;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add \n2.Display \n3.Exit");
		System.out.println("Enter the choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the product:");
			String product=sc.next();
			pd.addProductToList(product);
			break;
		case 2:
			List <String> ProductList=pd.getProductList();
			if(ProductList.isEmpty())
			{
				System.out.println("The list is empty");
			}
			else
			{System.out.println("The products are: ");
				pd.sortProductList();
				for(String item:ProductList)
				{
					System.out.println(item);
				}
				
			}
			
			break;
		case 3:
			System.out.println("Thank you for using the application");		
		}

	}

	while(choice!=3);
		System.out.println("Invalid input");
	}

}
