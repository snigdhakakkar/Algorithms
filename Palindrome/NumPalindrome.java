public class NumPalindrome {
    public boolean isPalindrome (int x) {
        boolean result = true;
        String y = Integer.toString(x);
        char[] j = y.toCharArray();
        for (int i = 0; i < j.length; i++) {
            int k = j.length;
            if (j[i] != j[k - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main (String[] args){
        NumPalindrome palindrome = new NumPalindrome();
        int x = 123421;
        Boolean result = palindrome.isPalindrome(x);
        System.out.println(result);
    }
}
