package kiran.com;

public class ffff
{
    public static void main(String args[])
    {
        int n;
        System.out.println("even number are");
        even(100);
    }
    static void even(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
        even(n-1);

    }
}