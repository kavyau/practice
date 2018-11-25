

public class Movezero_array
{
    // Function which pushes all zeros to end of an array.
    private static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0)
            {
                arr[count++] = arr[i]; //count gets incremented
            }
        }
        while (count < n)
        {
            arr[count++] = 0; //here count is set as index of first 0 element
        }
    }


    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the end: ");

        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
