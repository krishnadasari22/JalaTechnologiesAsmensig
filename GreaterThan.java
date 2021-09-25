// Java code to illustrate
// greater than operator

import java.io.*;

class GreaterThan {
	public static void main(String[] args)
	{
		// initializing variables
		int var1 = 30, var2 = 20, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 > var2: "
						+ (var1 > var2));

		// Comparing var1 and var3
		System.out.println("var3 > var1: "
						+ (var3 >= var1));
	}
}
