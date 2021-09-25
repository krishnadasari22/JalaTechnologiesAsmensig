package xyzpackage;

/* We are importing the abcpackage
 * but still we will get error because the
 * class we are trying to use has default access
 * modifier.
 */
import abcpackage.*;
public class Test {
   public static void main(String args[]){
	Addition obj = new Addition();
        /* It will throw error because we are trying to access
         * the default method in another package
         */
	obj.addTwoNumbers(10, 21);
   }
}