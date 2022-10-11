import java.io.*;
abstract class shape
{
double l=10,b=5;
abstract void printarea();
}
class rectangle extends shape
{
double area=l*b;
void printarea()
{
System.out.println("rect"+area);
}
}
class triangle extends shape
{
double area1=0.5*l*b;
void printarea()
{
System.out.println("tri"+area1);
}
}
class circle extends shape
{
double r=20;
double area2=2.14*r*r;
void printarea()
{
System.out.println("circle"+area2);
}
}
class a
{
public static void main(String args[])
{
rectangle r=new rectangle();
r.printarea();
triangle t=new triangle();
t.printarea();
circle c=new circle();
c.printarea();
}
}

