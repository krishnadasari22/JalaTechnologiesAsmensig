public class FindMissingNumber 
{
 public static void main(String[] args) 
 {
  int arr [] = {1, 10, 5, 9, 2, 7, 3, 0, 4, 6};   
  int n = arr.length; //length of the array
  int sum = n*(n+1)/2; //Find sum of all integers from 1 to n 
  int emptySpace = 0;
  int missingNo = 0;
  int result = 0;
   
  for (int i = 0; i < arr.length; i++) 
  {
   if(arr[i] == 0)
   {
    emptySpace = i; //Find the empty space
   }   
   else
   {
    result += arr[i]; //Add all the given array elements
   }
  }
  missingNo = sum - result;
     
  System.out.println("The Missing No is "+missingNo+" at the index "+emptySpace);
 }
}