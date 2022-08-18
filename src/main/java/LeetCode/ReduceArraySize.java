package LeetCode;

public class ReduceArraySize {

    public int minSetSize(int[] arr) {
        int totalSets = 0;
        int current = arr[0];
        int count = 0;
        int iteration = 0;
        for (int a: arr)
        {
            if (current != a)
            {
                System.out.println(arr[iteration] +" Count Before Change " + count);
                iteration+= count;
                current = a;
                    count = 1;
            }
            else{count++;};


        }
        System.out.println(arr[arr.length - 1] +" Count Before Change " + count);
        return totalSets;
    }

}

//3 3 3
