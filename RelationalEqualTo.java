// Java code to illustrate
// greater than or equal to operator

import java.io.*;

class RelationalEqualTo {
	public static void main(String[] args)
	{
		// initializing variables
		int var1 = 20, var2 = 20, var3 = 10;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 >= var2: "
						+ (var1 >= var2));

		// Comparing var2 and var3
		System.out.println("var2 >= var3: "
						+ (var3 >= var1));
	}
}
