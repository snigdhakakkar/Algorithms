public class ArraySum {

    public static void main (String args[]) {
        ArraySum y = new ArraySum();
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String result = y.arraySearch(arr, 6);
        System.out.println(result);
    }

    public String arraySearch (int [][] arr, int x){
        for (int i=0; i<arr.length; i++) {
            int sum = 0;
            for (int j=0; j < arr[0].length; j++){
                sum = sum + arr [i][j];
            }
            if (sum == x) {
                String result;
                result = "Sum of elements in row number  " + Integer.toString(i) + " is " + Integer.toString(x);
                return result;
            }
        }

        return "No row sum match found for the given number.";
    }
}
