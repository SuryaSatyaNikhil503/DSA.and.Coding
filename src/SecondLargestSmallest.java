import java.util.Scanner;

public class SecondLargestSmallest
{
    public static int secondSmall(int[] arr , int n)
    {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i=1 ; i<n ; i++)
        {
            if(arr[i] < smallest)
            {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < ssmallest && arr[i] != smallest)
            {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static int secondLar(int[] arr , int n)
    {
        int largest = arr[0];
        int slargest = -1;
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i] > largest)
            {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > largest && arr[i] < largest)
            {
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int secondLargest = secondLar(arr , n);
        int secondSmallest = secondSmall(arr , n);
        System.out.println(secondLargest + " "+ secondSmallest);
    }

}
