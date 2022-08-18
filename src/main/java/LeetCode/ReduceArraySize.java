package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class ReduceArraySize {

    public int minSetSize(int[] arr) {
        int totalSets = 0;
        int current = arr[0];
        int count = 0;
        int iteration = 0;
        int biggestArray = 0;
        System.out.println("The Half Length would be: " + arr.length / 2);
        System.out.println("Size Of Array Equals: " + arr.length);
         int halfSize = arr.length / 2;
         int SizeOfArray = arr.length;
        ArrayList<Integer> arrayListNumber = new ArrayList<Integer>();
        ArrayList<Integer> arrayListNumberCount = new ArrayList<Integer>();
        for (int a: arr)
        {
            if (a == arr.length - 1) { arrayListNumber.add(arr[iteration]); arrayListNumberCount.add(count); }
            if (current != a)
            {
                arrayListNumber.add(arr[iteration]);
                arrayListNumberCount.add(count);
                iteration+= count;
                current = a;
                count = 1;
            }
            else{count++;};

        }
        //System.out.println(arrayListNumber.add(arr.length - 1) +" Count Before Change " + arrayListNumberCount.add(count));
        for (int i = 0; i < arrayListNumber.size(); i++) {
            System.out.println("The Number >>>> "+arrayListNumber.get(i) +" <<<<< Appeared >>>> " + arrayListNumberCount.get(i) + " <<<< Times.");
        }
        return totalSets;
    }

}


//3 3 3
