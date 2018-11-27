import javafx.util.Pair;

public class Pair_array
{
    // n-size of array...x=sum of pair
    private static boolean pairInSortedRotated(int arr[],int n, int x)
    {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i+1])
                break;

        int l = (i + 1) % n; // l is now index of
        // minimum element

        int r = i;       // r is now index of maximum
                        //element


        while (l != r)
        {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            else  // Move to the lower sum side
                r = (n + r - 1) % n;
        }
        return false;
    }
    private static void printPairs(int arr[],
                                   int n, int x)
    {
        // int count = 0;

        // Consider all possible pairs
        // and check their sums
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] + arr[j] == x)
                {
                    System.out.println("(" + arr[i] +
                            ", " + arr[j] + ")");
                }
            }
        }
    }


    public static void main (String[] args)
    {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        int n = arr.length;

        if (pairInSortedRotated(arr, n, sum))
        {
            System.out.print("Array has two elements" +
                    " with sum 16");
            printPairs(arr,n,sum);
        }
        else
            System.out.print("Array doesn't have two" +
                    " elements with sum 16 ");
    }
}