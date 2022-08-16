package LeetCode;

public class FirstUnique {

    public int firstUniqChar(String s) {
        char[] charString = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            charString[i] = s.charAt(i);

            System.out.println(charString[i]); //a == b
        }
        for (int i = 0; i < s.length(); i++) {

            if (i != s.length() - 1) {
                if (charString[i] == charString[i + 1]) {
                    System.out.println("Found reoccuring");
                    System.out.println(i - 1);
                    return i - 1;
                }
            }
        }


        return 1;
    }

}
