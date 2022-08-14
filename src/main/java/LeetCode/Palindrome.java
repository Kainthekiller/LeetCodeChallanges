package LeetCode;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String normal = String.valueOf(x);
        String reverse = "";
        char[] reverseArray = new char[normal.length()];


        for (int i = normal.length(); i > 0; i--)
        {
            reverseArray[i - 1] = normal.charAt(i - 1);
            reverse += reverseArray[i - 1];
        }
        if (normal.equals(reverse))
        {
            System.out.println("Returning True");
            return true;
        }
        System.out.println("Returning False");
        return false;
    }

}
