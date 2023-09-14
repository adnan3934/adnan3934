import java.util.StringTokenizer;
public class stri
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my name adnan"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}