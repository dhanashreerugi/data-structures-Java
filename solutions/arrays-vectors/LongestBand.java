import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class LongestBand {


    // Given an array of integer containing N integers , find length of longest band 

    // band is defined as subsequence which can be re-ordered in such a manner . all elements appear consecutive

    // band = absolute sum is 1 between neighbours

    // Input :
    // [6,3,0,1,4]

    // output :
    //0,1
    //3,4
    //6

    public static int getMaxBand(int[] arr) {

        HashSet < Integer > hs = new HashSet < > ();
        Vector < Integer > result = new Vector < > ();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {


            if (!hs.contains(arr[i] - 1)) {
                int bandCounter = 1;
                int nextNum = arr[i] + 1;
                while (hs.contains(nextNum)) {
                    bandCounter++;
                    nextNum++;

                }
                result.add(bandCounter);
            }
        }

        int maxLength = Collections.max(result);
        return maxLength;

    }

    public static void main(String[] args) {

        int a[] = {1,9,3,0,18,5,2,4,10,7,12,6};

        System.out.println(getMaxBand(a));
    }
}