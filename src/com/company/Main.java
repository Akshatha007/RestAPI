package com.company;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String Name ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		Name = sc.nextLine();
		returningTheName(Name);
	}
	
	public static void returningTheName(String Name)
	{
		System.out.println(Name);
		System.out.println("This would be my sweet name ",+Name);
	}
}