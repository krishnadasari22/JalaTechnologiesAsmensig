public class ArithmeticException
{
void division(int a,int b)
{
int c=a/b;
System.out.println("Division has been successfully done");
System.out.println("Value after division: "+c);
}
public static void main(String[] args)
{
ArithmeticException ex=new ArithmeticException();
ex.division(10,0);
}
}