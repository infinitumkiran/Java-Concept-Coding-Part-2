import java.util.*;
class Sample
{
	static hi=10;
	int bye;
	public static void main(String args[])
	{
	 	int n,rem,rev=0,a=10,b=20,c,p,q,r,rollno;
		double half,root=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		n=obj.nextInt();
		for(;n>0;)
		{
		 rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
		}
		c=a+b;

		System.out.println("reverse of a number is "+rev);
		System.out.println("sum of "+a+" and "+b+" is "+c);
	
		System.out.println("part three");
		System.out.println("enter coefficients in for a quadratic equation ax*x+b*x+c");
		p=obj.nextInt();
		q=obj.nextInt();
		r=obj.nextInt();
		half=q*q-4*p*r;
		if(half>0)
		{
		root=((-1)*q+Math.sqrt(half));
		}
		root=root/2*p;
		System.out.println("root="+root); 
		System.out.println("pattern 4");	
		for(int j=1;j<5;j++)
		{
			for(int k=j;k<5;k++)
				{
				System.out.print(" ");
				}
			for(int l=j;l>0;l--)
				{
				System.out.print("*");
				}

			System.out.println("\n");
		}
//PART 4
		Sample s=new Sample();
		System.out.println("ans is"+(s instanceof Sample));
		//rollno = obj.nextInt();
		//System.out.println(" " + rollno);
                      	Sample[] t=new Sample[10];
		for(int i=0;i<5;i++)
		t[i]=new Sample();
		for(int i=0;i<5;i++)
		t[i].sample();
//PART 5
	`	int x,y,z,result;
		x=obj.nextInt();
		y=obj.nextInt();
		z=obj.nextInt();
		result=((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println(result);
		System.out.println(hi);
		bye=obj.nextInt();
		System.out.println(bye);
		
	}
//PART 6
	public void sample()
	{
		int a=10;
		System.out.println(a);
	}	
	
	
}
