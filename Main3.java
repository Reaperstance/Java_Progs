import java.util.Scanner;

public class Main3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    int a = 2;
    int b = 1;
    int fact = 1;

    for (int i = 0; i < n; i++)
    {
      if (i % 2 == 0)
      {
        System.out.print(a + ", ");
        a += 2;
      }
      else
      {
        System.out.print(b + ", ");
        fact *= (i / 2 + 1);
        b = fact;
      }
    }
  }
}
