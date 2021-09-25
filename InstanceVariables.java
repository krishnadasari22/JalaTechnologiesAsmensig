// Java Program to Check the Accessibility
// of an Instance variable by a Static Method

import java.io.*;

class InstanceVariables {

	// Instance variable
	public int k = 10;

	public static void main(String[] args)
	{

		// try to access instance variable a
		// but it's give us error
		System.out.print("value of a is: " + k);
	}
}
