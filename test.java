public class test{
public static void main(String ar[])
{
  int a,b,c,d,e;
  a=10;
  b=5;
  c=5;
try
{
 d=a/(b-c);
 System.out.println("Division="+d);
}
catch(ArithmeticException x)
{
System.out.println("Divide by Zero Error");
}
e=a/(b+c);
System.out.println("Division="+e);
}
}