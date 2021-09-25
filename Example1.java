// Java program to illustrate
// ClassNotFoundException
public class Example {
	
	public static void main(String args[]) {
		try
		{
			Class.forName("GeeksForGeeks");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
