import java.util.Scanner;

public class Sieve
{
    static void sieve(int n)
    {
        boolean[] primes = new boolean[n+1];
        for(int i=0 ; i<=n ; i++)
        {
            primes[i] = true;
        }

        for(int j=2 ; j*j <= n ; j++)
        {
            if(primes[j] == true)
            {
                for(int i=j*j ; i<=n ; i += j)
                {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i] == true)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
       // m = sc.nextInt();
        sieve(n);
    }
}
