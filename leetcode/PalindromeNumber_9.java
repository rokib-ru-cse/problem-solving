package leetcode;

public class PalindromeNumber_9 {

    public boolean isPalindrome(int data) {

        long temp = data;
        long newNum = 0;
        while (temp > 0) {
            newNum = (newNum * 10) + temp % 10;
            temp = temp / 10;
        }
        return newNum == data;
    }

    public static void main(String[] args) {

    }
}
