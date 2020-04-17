#include <bits/stdc++.h>

using namespace std;
int main()
{
    unsigned int i = 1;
    char *c = (char*)&i;
    if (*c)
        cout<<"Little endian";
    else
        cout<<"Big endian";
    getch();
}

// This code is contributed by rathbhupendra
