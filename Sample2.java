import java.util.*;
class Sample2
{
	int binarysearch(int a[],int l,int r,int x)
	{
	 if(r>=l)
	{  
	int mid=(l+(r-1))/2;	
	if(a[mid]==x)
	  return 1;
	else if(a[mid]<x)
	  return binarysearch(a,mid+1,r,x);
	else if(a[mid]>x)
	  return binarysearch(a,l,mid-1,x);
	}
	return -1;
	}
	public static void main(String args[])
	{
	  int low,high,key,n,z;
	  Scanner obj=new Scanner(System.in);
	  Sample2 s=new Sample2();
	  System.out.println("enter values of an array");
	 n=obj.nextInt(); 
	 int a[]=new int[n];
	  for(int i=0;i<n;i++)
	{
	 a[i]=obj.nextInt();
	}
	low=0;
	high=n-1;
	System.out.println("enter key to be found");
	key=obj.nextInt();
	z=s.binarysearch(a,low,high,key);
	if(z==1)
	 System.out.println("key is found");
	else
	 System.out.println("not found");
	}
}