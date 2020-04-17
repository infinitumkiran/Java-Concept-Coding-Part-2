#include<bits/stdc++.h>
#include<math.h>
using namespace std;
//#pragma GCC optimize ("O3")
 int a[15];
int main()
{
    //ios_base::sync_with_stdio(false);
    //cin.tie(NULL);
    long long int n;
    while(cin>>n)
    {
        int c=0;
        memset(a,0,sizeof(a));
        /* if(n==0)
          {
              cout<<"0"<<endl;
          }

         else{
        while(n>0)
        {
          a[i++]=n%2;
          n=n/2;
          c++;
        }
        i=0;
        m=c;

        while(c--)
        {
            if(a[i]==1)
            {
                p=i;
                break;
            }
            i++;
        }
        ;*/
        while(n>=0)
        {
            if(n%2==0)
            {
                c++;
                n=n/2;
            }
            else if(n%2==1)
            {
                break;
            }

            }
            cout<<pow(2,c)<<endl;

        }

    }
