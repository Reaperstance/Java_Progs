class sum100
{
  public static void main(String[] args)
  {
    int s = 0;

    for (int i = 101; i < 200; i++)
    {
      if (i % 7 == 0)
        s += i;
    }

    System.out.println("Sum: " + s);
  }
}
