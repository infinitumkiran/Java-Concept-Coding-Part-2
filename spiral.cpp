#include<iostream.h>
using namespace std;
int main()
{
char ch[100000];
cin>>ch;
  int l = 0,flag=0; 
    int h = strlen(ch) - 1; 
  
    // Keep comparing characters while they are same 
    while (h > l) 
    { 
        if (ch[l++] != ch[h--]) 
        { 
           cout<<"no";
		flag=1;
        } 
    } 
   if{flag==0)
	cout<<"yes";
return 0;
} 
