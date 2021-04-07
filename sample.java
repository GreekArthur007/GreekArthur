import java.lang.*;
class monster extends Thread
{
public void run()
{
System.out.print("hello monster");
}

}


class sample
{
public static void main(String args[])
{
monster t=new monster();
t.start();
}
}