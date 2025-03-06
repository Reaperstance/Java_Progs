import java.util.*;

class student1 
{
    public String studentID;
    public String name;
    public String course;
    public int age;
    public int p = 1;
    public int s = 0;
    public String g = "";
    public int[] marks = new int[5];

    student1() 
    {
        Scanner sc = new Scanner(System.in);
        int l = marks.length;

        System.out.println("Enter the Student ID along with a gender specification.");
        System.out.println("For eg. If a student's ID is 123 and her gender is female then it would look like, 123F");
        studentID = sc.next();

        System.out.println("Enter the Name of the Student");
        name = sc.next();

        System.out.println("Enter the course of the Student");
        course = sc.next();

        System.out.println("Enter the marks of the student for 5 subjects");
        for (int i = 0; i < l; i++) 
        {
            int mark;
            while (true) 
            {
				System.out.println("Enter the marks of subject " + (i+1));
                mark = sc.nextInt();
                if (mark < 0 || mark > 100) 
                {
                    System.out.println("The inserted marks are invalid! Please enter marks between 0 and 100.");
                } 
                else 
                {
                    marks[i] = mark;
                    break;
                }
            }
        }
    }

    public void calcT() 
    {
        s = 0;
        for (int i = 0; i < marks.length; i++) 
        {
            s = s + marks[i];
        }
        p = (s * 100) / 500;
    }

    public void grade() 
    {
        if (p > 100 || p < 0) 
        {
            System.out.println("Invalid input of marks. The total percentage is out of the valid range (0-100).");
        } 
        else if (p >= 90) 
        {
            g = "A";
        } 
        else if (p >= 75) 
        {
            g = "B";
        } 
        else if (p >= 60) 
        {
            g = "C";
        } 
        else if (p >= 40) 
        {
            g = "D";
        } 
        else 
        {
            g = "Fail";
        }
    }

    void disp() 
    {
        System.out.println("The ID of the Student is " + studentID + "\n");
        System.out.println("The Name of the Student is " + name + "\n");
        System.out.println("The Age of the Student is " + age + "\n");
        System.out.println("The Course of the Student is " + course + "\n");
        System.out.println("The marks of the Student are " + Arrays.toString(marks) + "\n");
        System.out.println("The total marks of the Student is " + s + "\n");
        System.out.println("The Percentage of the Student is " + p + "\n");
        System.out.println("The Grade of the Student is " + g + "\n");
    }
}

class Sstd 
{
    public static void main(String args[]) 
    {
        student1 obj = new student1();
        obj.calcT();
        obj.grade();
        obj.disp();
    }
}
