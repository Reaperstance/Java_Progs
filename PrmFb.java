class Fibonacci
{
    void printFibPrm()
    {
        int c = 0, a = 0, b = 1;
        
        System.out.println("First 8 prime numbers in Fibonacci sequence:");
        
        while (c < 8)
        {
            int n = a + b;
            a = b;
            b = n;
            
            if (n > 1)
            {
                int f = 1;
                for (int i = 2; i <= n; i++)
                {
                    if (n % i == 0 && i != n)
                    {
                        f = 0;
                        break;
                    }
                }
                if (f == 1)
                {
                    System.out.print(n + " ");
                    c++;
                }
            }
        }
        System.out.println();
    }
}

class PrmFb
{
    public static void main(String[] args)
    {
        Fibonacci obj = new Fibonacci();
        obj.printFibPrm();
    }
}
