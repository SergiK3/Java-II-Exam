import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Problems {
    //1.     დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა.
    // (პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან).
    //Boolean isPalindrome(String text);

    public static boolean isPalindrome(String text) {
        char[] arr = text.toCharArray();
        char[] arr1 = new char[arr.length];

        for (int i = 0,j= arr.length - 1; i < arr.length; i++,j--) {
            arr1[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        if (Arrays.equals(arr,arr1)) {
            return true;
        }
        return false;
    }
//2.     გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა (თეთრებში)
// და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.

}