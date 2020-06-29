public class ArrayGame2 {

    public String arrayGame (int [] arr) {

        int sum = 0;
        int greatest = 0;
        String result;
        for (int j = 0; j < arr.length; j++ ) {
            if (arr[j] > greatest) {
                int temp = greatest;
                greatest = arr[j];
                sum = sum + temp;
            } else {
                sum = sum + arr[j];
            }
        }
        if (sum == greatest) {
            result = "Sum of rest of the numbers in the array equals one number.";
            return result;
        }

        result = "Not possible.";
        return result;


    }

    public static void main (String[] args) {
        ArrayGame2 y = new ArrayGame2();
        int arr[] = {1,2,3,6};
        String result = y.arrayGame(arr);
        System.out.println(result);
    }
}
