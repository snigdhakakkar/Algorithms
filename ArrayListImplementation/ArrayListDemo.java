public class ArrayListDemo {

    int [] arr;
    int arrayLength = 0;


    public int indexOf(int num) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == num) {
                return k;
            }
        }
        return -1;
    }

    public boolean contains(int num) {
        for (int k = 0; k < arrayLength ; k++) {
            if(arr[k] == num) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return arrayLength;
    }

    public void add (int num) {
        if (arr == null) {
            arr = new int [10];
        }
        if (arrayLength == arr.length) {
            doubleTheArray();
        }
        System.out.println("Adding element: "+num);
        arr[arrayLength] = num;
        arrayLength++;

    }

    private void doubleTheArray() {
        int newArrayLength  = arr.length * 2;
        int [] arr1 = new int [newArrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;
    }

    public static void main (String args[]) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.add(10);
        arrayListDemo.add(5);
        arrayListDemo.add(15);
        arrayListDemo.add(51);
        arrayListDemo.add(522);


        System.out.println("size is: "+arrayListDemo.size());
        System.out.println("array size is: "+arrayListDemo.arr.length);
        System.out.println(arrayListDemo.indexOf(51));
        System.out.println(arrayListDemo.contains(522));
    }
}
