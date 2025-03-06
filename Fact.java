import java.math.BigInteger;
import java.util.Scanner;

class FactCalc
{
    public BigInteger f(int num)
    {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}

class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        FactCalc calc = new FactCalc();
        BigInteger fact = calc.f(num);
        System.out.println("The factorial of " + num + " is: " + fact);
    }
}
