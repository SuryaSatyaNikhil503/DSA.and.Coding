import java.util.Scanner;

public class SumOfPrimesOrNot
{
    static int isPrime(int n)
    {
        for(int i=2 ; i<=Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return 0;
        }
        return 1;
    }

    static int nxtPrime(int n)
    {
        do
        {
            n++;
        }while(isPrime(n) == 0 );
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int n = sc.nextInt();
        for(int i=2 ; i<=(n-i) ; i = nxtPrime(i))
        {
            if(isPrime(n - i) == 1)
            {
                flag = 1;
                System.out.println((i) + "+"+ (n-i) + "="+ (n) );
            }
        }
        if(flag == 0)
        {
            System.out.println(n+" cannot be expressed as sum of two primes.");
        }
    }
}
