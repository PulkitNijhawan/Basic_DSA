#include<iostream>
#include<cstring>
using namespace std;
bool palindrome(string s){
    bool palin=true;
    while(i<=s.length()/2){
        if(s[i]!=s[s.length()-i-1]){
            palin false;
            break;
        }
        return palin;

    }
}
int main(){
    string s="abc";
    for(int i=0;i<s.length();i++){
        for(int j=1;j<=s.length()-i;j++){
            string str=s.substr(i,j);
            cout<<str<<endl;
        }
    }
}