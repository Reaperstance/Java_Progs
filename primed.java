import java.util.*;

class prime1
{
	public void prime()
	{
        	int i, j, c1 = 0;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the range (preferably 1000):");
        	int n = sc.nextInt();
        
        	System.out.println("Prime numbers up to " + n + " are:");
        	for (i = 2; i <= n; i++) 
		{
            		int c = 0;
            		for (j = 2; (j*j) <= i; j++)
			{ 
                		if (i % j == 0) 
				{
                    			c = 1;
                   		 	break;
                		}
            		}

            		if (c == 0)
			{
				System.out.print(i + " ");
                		c1++;
            		}
        	}
        	System.out.println("Total prime numbers: " + c1);
    	}
}


class primed 
{
    public static void main(String args[])
	{
        	prime1 obj = new prime1();
        	obj.prime();
   	}
}
