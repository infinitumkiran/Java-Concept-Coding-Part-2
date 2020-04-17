#include<iostream>
using namespace std;
int main()
{
    long n;
    cin>>n;
    long temp1=((n*(n+1))/2)+1;
    long temp2=(2*temp1)-n-1;
    long n1=1;
    long n2=temp2,mul=2,s=n;
    for(long i=1;i<=n;i++)
    {
      if(i==2)
      {
        for(int m=1;m<=i;m++)
          cout<<"*";
        mul=mul+2;
      }
      else if(i>2)
      {
        for(int p=1;p<=2*i;p++)
          cout<<"*";
        mul=mul+2;
      }
    for(int j=1;j<=n-i+1;j++)
    {
        cout<<n1<<"0";
        n1++;
    }
    {
    for(int k=1;k<=n-i;k++)
    {
        cout<<n2<<"0";
        n2++;
    }
    cout<<n2;
    }
    n2=n2-2*(s-1);
    s--;
    cout<<endl;
    }
    return 0;
}