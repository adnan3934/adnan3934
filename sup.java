class ani
{
void abc()
{
System.out.println("first class meth");
}
}
class sup extends ani
{
sup()
{
super();
System.out.println("its 2");
}
}
class ts
{
public static void main(String args[])
{
sup c=new sup();
} 
}