public class Palindrome {

    public boolean isPalindrome (String x) {
        boolean result = true;
        char[] j = x.toCharArray();
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
        Palindrome palindrome = new Palindrome();
        String x = "mosom";
        Boolean result = palindrome.isPalindrome(x);
        System.out.println(result);
    }
}
