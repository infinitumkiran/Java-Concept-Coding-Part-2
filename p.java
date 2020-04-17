class p{
void logic(String s[],int l,int r)
{
	if(l==r)
	{
	System.out.println(s);
	}
	else
	{
	for(int j=l;j<r;j++)
	{
	swap(s[j],s[l]);
	logic(s,l+1,r);
	swap(s[j],s[l]);
	}
	}
}
void swap(String a,String b)
{
	String temp=a;
	a=b;
	b=temp;
}
public static void main(String args[])
{
	String s[] = {"A","B","C"};  
	p o=new p();
    	int n = s.length;  
   	o.logic(s, 0, n-1);  
}
} 