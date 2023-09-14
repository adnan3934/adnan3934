class A
{
void abc()
{
System.out.println("father has 50000$");
}
}
class B extends A
{
void mom()
{
System.out.println("mom has 5yd");
}
}
class minher extends B
{
public static void main(String args[])
{
minher s=new minher();
s.mom();
s.abc();
}
}
