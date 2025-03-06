import java.util.*;
class PrimeChecker
{
  boolean c(int num)
  {
    boolean p = true;

    for (int i = 2; i <= num / 2; ++i)
    {
      if (num % i == 0)
      {
        p = false;
        break;
      }
    }

    return p;
  }
}

public class Main1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();
    boolean f = false;
    PrimeChecker obj = new PrimeChecker();

    for (int i = 2; i <= n / 2; ++i)
    {
      if (obj.c(i))
      {
        if (obj.c(n - i))
        {
          System.out.printf("%d = %d + %d\n", n, i, n - i);
          f = true;
        }
      }
    }

    if (!f)
      System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
  }
}
