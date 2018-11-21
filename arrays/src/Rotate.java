public class Rotate
{
     private static void leftRotate(int arr[], int d, int n)//d=by what size to rotate
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

     private static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }
    private static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    public static void main(String[] args)
    {
        Rotate rotate = new Rotate();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        leftRotate(arr, 2, 7);
        printArray(arr, 7);
    }
}


