import java.util.Scanner;

public class Main2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    int a = 0;
    int b = 2;
    int pw = 1;

    for (int i = 0; i < n; i++)
    {
      System.out.print(a + ", " + b + ", ");
      a = a + pw;
      pw = pw * 2;
      b = pw;
    }
  }
}
