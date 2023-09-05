import java.io.*;
class linear search
{
public static int linear search(int arr[],int key)
{
for(int i=0; i<arr.length;i++)
{
if(arr[i]==key)
{
return i;
}
}
return-1;
}
public static void main(String args[])
{
int a1[]={10,20,30,50,60,70};
int key=50;
System.out.print;n(key +"is found at index,"+linear search(a1.key));
}
}
