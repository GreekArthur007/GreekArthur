import java.lang.*;
class mahendra extends Thread
{
 public void run()
{
System.out.println("hello monster");
}
public static void main(String args[])
{
mahendra m1=new mahendra();
mahendra m2=new mahendra();

mahendra m3=new mahendra();
System.out.println("hello monster"+m1.getPriority());
System.out.println("hello monster"+m2.getPriority());
System.out.println("hello monster"+m3.getPriority());


System.out.println("hello monster");
System.out.println("hello monster");
System.out.println("hello monster");
}
}