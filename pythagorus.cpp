#include<iostream>
#include<cmath>
using namespace std;
int main(){
    float a;cin>>a;
    float b;cin>>b;
    float c;cin>>c;
    if(pow(a,2)==pow(b,2)+pow(c,2)||pow(b,2)==pow(a,2)+pow(c,2)||pow(c,2)==pow(b,2)+pow(a,2)) cout<<"true";
    else cout<<"false";
}