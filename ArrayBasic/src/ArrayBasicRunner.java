import java.util.Arrays;

public class ArrayBasicRunner {

    public static void main(String[] args) {
        //array - (contiguous allocation of memory) for (same data type)
        //integer array allocation
        //(base - 0) - 1 (0 1 2 3)
        //(base - 4) - 2
        //(base - 8) - 4
        //(base - 12) - 6

        //array declaration
        //with data
        int [] array = {1, 2, 3, 4};
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        //array(I@7699a589) ----> [1, 2, 3, 4]I@7699a589

        //int Integer

        int [] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i;
        }

        System.out.println("(dynamicArray) = " + Arrays.toString(dynamicArray));



    }
}
