//StringTokenizer simple program 
import java.util.StringTokenizer;
public class stringtokenex
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
