#include <bits/stdc++.h>
#define optimizar_io ios_base::sync_with_stdio(0);cin.tie(0);
using namespace std;
int main()
{  optimizar_io
   long long int a,b;
   cin >> a >> b;
   while (a!=0 && b!=0){
        long long int aux=(b - a) - (floor(sqrt(b)) - ceil(sqrt(a)));
    cout << aux <<"\n";
    cin >> a >> b;
   }
    return 0;
}
