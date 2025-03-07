import java.util.Scanner;

class Series
{
    public void s(int n)
    {
        double sum = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++)
        {
            fact *= i;
            sum += 1.0 / fact;
        }

        System.out.println("The sum of the series up to " + n + " terms is: " + sum);
    }
}

class Series1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        Series series = new Series();
        series.s(n);
    }
}
