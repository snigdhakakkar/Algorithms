public class IsAnagram {

    public boolean isAnagram (String x, String y) {

        if (x == null || y == null) return false;
        if (x.length() != y.length()) return false;

        char[] arr1 = x.toCharArray();
        char[] arr2 = y.toCharArray();
        int[] arr = new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // if already matched this one then skip it
                    if (arr[j] == 1)
                        continue;

                    arr[j] = 1;
                }
            }
        }

        for (int i=0; i < arr.length; i++) {
            if (arr[i] == 0) return false;
        }
        return true;
    }


    public static void main (String[] args){
        IsAnagram anagram = new IsAnagram();
        String x = "AMARJ";
        String y = "RAAM";
        Boolean result = anagram.isAnagram(x,y);
        System.out.println(result);
    }
}
