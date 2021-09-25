/*Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.

There are many types of operators in Java which are given below:

Unary Operator,
Arithmetic Operator,
Shift Operator,
Relational Operator,
Bitwise Operator,
Logical Operator,
Ternary Operator and
Assignment Operator*/
 class Operator{  
public static void main(String args[]){  
int a=10;  
int b=10;  
int c=10;
int d=10;
a+=4;
b-=4;
boolean e=true;
boolean f=false;
System.out.println(a++ + ++a);//10+12=22  
System.out.println(b++ + b++);//10+11=21  
System.out.println(~d);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!e);//false (opposite of boolean value)  
System.out.println(!f);//true   
System.out.println(10<<2);
System.out.println(10<<3);
System.out.println(20<<2); 
System.out.println(15<<4);
 //For positive number, >> and >>> works same  
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  
    System.out.println(-20>>>2);  
    System.out.println(a<b&&a++<c);  
System.out.println(a);  
System.out.println(a<b&a++<c);
System.out.println(a);  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
System.out.println(a);  
System.out.println(b); 
}
}  