package org.sample.shaiksha786;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is you name?");
		String name = scanner.nextLine();
		System.out.println("How old are you");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("what is your favorite food");
		String food = scanner.nextLine();
		System.out.println("hello " +name);
		System.out.println("you are "+age+"years old ");
		System.out.println("you like " +food);
    }
}
