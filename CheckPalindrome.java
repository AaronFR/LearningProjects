import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
 
public class CheckPalindrome {

       public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
              String input = in.nextLine();

              char[] inputCharArray = input.toCharArray();

              boolean isPallindrome = true;
              for (int index = 0; index <= inputCharArray.length/2; index++) {
                     if (inputCharArray[index] != inputCharArray[inputCharArray.length - 1 - index]){
                            System.out.println(
                                   "Character Mismatch: '" + 
                                   inputCharArray[index] + 
                                   "' doesn't equal '" + 
                                   inputCharArray[inputCharArray.length - 1 -  index] +
                                   "'"
                            );
                            isPallindrome = false;
                     }
              }

              System.out.println(isPallindrome);
       }
}