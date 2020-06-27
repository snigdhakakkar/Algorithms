public class TwoDSearch {
    public static void main (String args[]) {
        TwoDSearch y = new TwoDSearch();
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        String result = y.twoDSearch(arr, 9);
        System.out.println(result);

    }
    public String twoDSearch (int [][] arr, int x){
        for(int i = 0; i < arr.length; i++){
            for(int j=0; j <arr[0].length; j++){
                if( arr[i][j] == x){
                    String result ;
                    result = Integer.toString(i) + "," + Integer.toString(j);
                    return result;
                }
            }
        }
        return "No match found.";
    }
}
