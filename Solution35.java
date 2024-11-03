// 2264. Largest 3-Same-Digit Number in String         //4-12-23(Monday)

//Approach = 1
public class Solution35 {

    public String largestGoodInteger(String num) {

        int n = num.length();

        char max = ' ';

        for (int i = 2; i < n; i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                max = (char) Math.max(max, num.charAt(i));
            }
        }

        if (max == ' ') {
            return "";
        }

        return new String(new char[] { max, max, max });
    }

}

// approach = 2

// class Solution {
// public String largestGoodInteger(String num) {
// if (num.indexOf("999") != -1) {
// return "999";
// } else if (num.indexOf("888") != -1) {
// return "888";
// } else if (num.indexOf("777") != -1) {
// return "777";
// } else if (num.indexOf("666") != -1) {
// return "666";
// } else if (num.indexOf("555") != -1) {
// return "555";
// } else if (num.indexOf("444") != -1) {
// return "444";
// } else if (num.indexOf("333") != -1) {
// return "333";
// } else if (num.indexOf("222") != -1) {
// return "222";
// } else if (num.indexOf("111") != -1) {
// return "111";
// } else if (num.indexOf("000") != -1) {
// return "000";
// }

// return "";

// }
// }