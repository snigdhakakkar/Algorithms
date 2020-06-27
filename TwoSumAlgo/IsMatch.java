public class IsMatch {

    public boolean isMatch (int [] arr, int x) {
        for(int i = 0; i<arr.length; i++) {
            for(int k = i+1; k < arr.length; k++) {
                for(int n = k+1; n < arr.length; n++){
                    if (arr[i] + arr[k] + arr[n] == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main (String[] args){
        IsMatch y = new IsMatch();
        int [] arr = {1,2,3,4};
        Boolean result = y.isMatch(arr, 9);
        System.out.println(result);
    }




}
