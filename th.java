import java.lang.*;
public class th extends Thread
{
int i;
public void run()
{
for(i=0;i<=5;i++)
{
System.out.println("child");
}
}
}
class test
{
public static void main(String[] args)
{
int i;
th t=new th();
t.start();
for(i=0;i<10;i++)
{
System.out.println("main th");
}
}
}