import java.util.*;
public class CountEvenandOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int evenCount = 0, oddCount = 0;
        for(int i=a ; i<=b ; i++)
        {
            if(i % 2 == 0)
            {
                evenCount+=1;
            }
            else
            {
                oddCount+=1;
            }
        }
        System.out.println("Even Numbers Count:"+evenCount);
        System.out.println("Odd Numbers Count:"+oddCount);
    }
}
