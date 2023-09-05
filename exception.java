import java.io.*;
class exception
{
public static void main(String args[])
{
try{
throw new myexception(2);
}
catch(my exceptione){
System.out.println(e);
}}
class myexception extends exception{
int a;
myexception(int b)
{
a=b;
}
public string to string();{
return("exception number="+a);
}}}
