import java.util.Vector; 

public class MergeSort {

    public static void merge(Vector<Integer> arr, int start, int end) {
        
        int i = start;
        int m = (start + end) / 2;
        int j = m + 1;

        Vector<Integer> temp = new Vector<>();

        while (i <= m && j <= end) {
            if(arr.get(i) < arr.get(i))
            {
                temp.add(arr.get(i));
                i++;
            }
            else {
                temp.add(arr.get(i));
                i++;
            }
        }

        // copy r3emaining elements from first array
        while(i<=m)
        {
            temp.add(arr.get(i));
            i++;
        }

        while(j<=end)
        {
            temp.add(arr.get(j));
            j++;
        }

        int k =0;
        for (int k2 = start; k2 <= end; k2++) {
            // arr.add(temp.get(k));
            arr.set(k2, temp.get(k));
            k++;
        }
        // return arr;
        // System.out.println(arr);

    }


    public static void mergeSort(Vector<Integer> arr, int start, int end) {
        
        // base case
        if(start >= end)
        {
              
              return;
        }

        //recursion case

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end);


    }
   
    public static void main(String[] args) {

        int[] array = {10,5,2,0,7,6,4};
       
        Vector<Integer> arr = new Vector<>();

        for (int i = 0; i < array.length; i++) {
            arr.add(array[i]);
        }

        int start = 0;
        int end = arr.size() -1;

        mergeSort(arr, start, end);

        for (Integer a : arr)
        {
            System.out.println(a);
        }
        
    }
    
}