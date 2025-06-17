import java.util.*;
import java.util.Scanner;

public class InversionCounter {

    public static int countInversions(int[] arr)
    {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    public static int mergeSort(int[] arr, int[] temp, int left, int right) 
      {
        int count = 0;
        if (left < right) 
         {
            int mid = (left + right) / 2;

            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid, right);
        }
        return count;
     }

    public static int merge(int[] arr, int[] temp, int left, int mid, int right)
     {
        int i = left;
        int j = mid + 1;
        int k = left;
        int count = 0;

        while (i <= mid && j <= right) 
        {
            if (arr[i] <= arr[j]) 
            {
                temp[k++] = arr[i++];
            } 
            else 
            {
                temp[k++] = arr[j++];
                count += (mid - i + 1);  // Inversion count
            }
        }

        while (i <= mid)
        {
         temp[k++] = arr[i++];
        }
        while (j <= right)
        {
           temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) 
        {
            arr[i] = temp[i];
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = countInversions(arr);
        System.out.println(result);
    }
}