package LeetCode;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        String ssNew = "";
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            charArray[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            ssNew += charArray[i];
        }


        return ssNew;
    }
}
