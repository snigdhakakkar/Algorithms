public class ArrayGame {
    public String arrayGame (int [] arr) {
        int i;
        int k = arr.length;
        for (i=0; i<k; i++) {
          int sum = 0;
          for (int l = 0; l < k; l++) {
              if (l != i) {
                  sum = sum + arr[l];
              }
          }

          if (sum == arr[i] ) {
              String result;
              result = "It is possible to express sum of all the array numbers as one array entry.";
              return result;
          }
        }
        return "It is impossible to have one number equal to the sum of other numbers in the array.";
    }

    public static void main (String[] args){
        ArrayGame y = new ArrayGame();
        int arr[] = {1,2,3,6};
        String result = y.arrayGame(arr);
        System.out.println(result);
    }
}
