class box
{
	double l,b,h;
	box()
	{
		l=b=h=0.0;
		System.out.println("Default Constructor called.");
	}
	
	box(double l1, double b1, double h1)
	{
		l=l1;
		b=b1;
		h=h1;
		System.out.println("Parameterized constructor called.");
	}
	
	box(double n)
	{
		l=b=h=n;
		System.out.println("Parameterized constructor accepting a parameter.");
		System.out.println("Forming a cube");
	}

	box(box r)
	{
		l = r.l;
		b = r.b;
		h = r.h;
		System.out.println("Clone of a consructor of base class");
	}

	double volume()
	{
		return l*b*h;
	}

	protected void Finalize()
	{
		System.out.println("Final Message before the termination of the program");
	}

}

class box_Demo
{
	public static void main(String args[])
	{
		box b1 = new box();
		box b2 = new box(5,3,2);
		box b3 = new box(5);
		box b4 = new box(b2);

		System.out.println("Out put for Default constructor "+ b1.volume());
		System.out.println("Out put for Parameterized constructor "+b2.volume());
		System.out.println("Out put for Parameterized constructor accepting single parameter "+b3.volume());
		System.out.println("Out put for referenced calling constructor "+b4.volume());
	}
}



	
	