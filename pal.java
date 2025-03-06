import java.util.*;

class Palindrome
{
    public void check(int n)
    {
        int o = n;
        int r = 0;

        while (n != 0)
        {
            int d = n % 10;
            r = (r * 10) + d;
            n /= 10;
        }

        if (o == r)
        {
            System.out.println(o + " is a palindrome.");
        }
        else
        {
            System.out.println(o + " is not a palindrome.");
        }
    }
}

class pal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Palindrome palin = new Palindrome();
        palin.check(n);
    }
}
