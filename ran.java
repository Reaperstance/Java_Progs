import java.util.*;

class ran
{
  public static void main(String[] args)
  {
    Random r = new Random();
    
    for (int i = 0; i < 5; i++)
    {
      System.out.println(r.nextInt(100) + 1);
    }
  }
}
