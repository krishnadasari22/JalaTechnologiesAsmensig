// Java program to illustrate
// FileNotFoundException

// All output and input streams
// are available in java.io package
import java.io.*;

public class Example2
{
public static void main(String[] args)
{
		
	// creating object of FileReader
	FileReader reader = new FileReader("file.txt");
	
	// passing FileReader to
	// buffered reader
	BufferedReader br = new BufferedReader(reader);
	
	// declaring empty string
	String data =null;
	
	// while loop to read data
	// and printing them
	while ((data = br.readLine()) != null)
	{
		System.out.println(data);
	}
	
	// closing the object
	br.close();
}
}
