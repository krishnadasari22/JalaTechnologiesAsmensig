import java.util.Scanner;
public class InsertElement
{
   public static void main(String[] args) 
   {
      int number, position, insert;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of elements in array: ");
      number = sc.nextInt();
      int[] arrNumbers = new int[number + 1];
      System.out.println("Please enter " + number + " elements: ");
      for(int a = 0; a < number; a++)
      {
         arrNumbers[a] = sc.nextInt();
      }
      System.out.println("Please enter position to insert element: ");
      position = sc.nextInt();
      System.out.println("Please enter element you want to insert: ");
      insert = sc.nextInt();
      for(int a = (number - 1); a >= (position - 1); a--)
      {
         arrNumbers[a + 1] = arrNumbers[a];
      }
      arrNumbers[position - 1] = insert;
      System.out.println("After inserting element: ");
      for(int a = 0; a < number; a++)
      {
         System.out.print(arrNumbers[a] + ",");
      }
      System.out.print(arrNumbers[number]);
      sc.close();
   }
}