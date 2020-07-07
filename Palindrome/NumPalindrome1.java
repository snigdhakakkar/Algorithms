public class NumPalindrome1 {
    public boolean isPalindrome (int x) {
        boolean result;
        int temp = 0;
        int reverseNum = 0;
        int y = x;
        while (y != 0) {
            temp = y%10;
            reverseNum = reverseNum * 10 + temp;
            y = y /10;
        }
        if (reverseNum == x) {
            return true;
        }
        return false;
    }

    public static void main (String[] args){
        NumPalindrome1 palindrome = new NumPalindrome1();
        int x = 123321;
        Boolean result = palindrome.isPalindrome(x);
        System.out.println(result);
    }
}
