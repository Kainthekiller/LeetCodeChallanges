package LeetCode;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] holder = new char[s.length()];
        int value = 0;
        System.out.println(s);
        char I = 1;
        char V = 5;
        char X = 10;
        char L = 50;
        char C = 100;
        char D = 500;
        char M = 1000;
        for (int i = 0; i < s.length(); i++) {
            holder[i] = s.charAt(i);
        }
        for (int i = 0; i <= s.length() - 1; i++) {

            if (i != s.length() - 1) {
                if (holder[i] == 'I' && holder[i + 1] == 'V') {
                    value += 4;
                    i++;
                } else if (holder[i] == 'I' && holder[i + 1] == 'X') {
                    value += 9;
                    i++;
                } else if (holder[i] == 'I') {
                    value += 1;
                }
                else if (holder[i] == 'V') {
                    value += 5;
                }
                else if(holder[i] == 'X' && holder[i + 1] == 'L') {
                    value += 40;
                    i++;
                } else if (holder[i] == 'X' && holder[i + 1] == 'C') {
                    value += 90;
                    i++;
                } else if (holder[i] == 'X') {
                    value += 10;
                }
                else if (holder[i] == 'L') {
                    value += 50;
                }
                else if (holder[i] == 'C' && holder[i + 1] == 'D') {
                    value += 400;
                    i++;
                } else if (holder[i] == 'C' && holder[i + 1] == 'M') {
                    value += 900;
                    i++;
                } else if (holder[i] == 'C') {
                    value += 100;
                }
                else if(holder[i] == 'D') {
                    value += 500;
                }
                else if(holder[i] == 'M') {
                    value += 1000;

                }
            }
            else {
                if (holder[i] == 'I') {
                    value += 1;
                }
                if (holder[i] == 'V') {
                    value += 5;
                }
                if (holder[i] == 'X') {
                    value += 10;
                }
                if (holder[i] == 'L') {
                    value += 50;
                }
                if (holder[i] == 'C') {
                    value += 100;
                }
                if (holder[i] == 'D') {
                    value += 500;
                }
                if (holder[i] == 'M') {
                    value += 1000;
                }
            }


        }
        return value;

    }
}

