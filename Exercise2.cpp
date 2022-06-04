#include<iostream>
#include<cstring>

using namespace std;

void sortC(char s[1000]){
    // cout<<strlen(s);
    for(int i=0;i<strlen(s);i++){
        for(int j=1;j<strlen(s);j++){
            if(s[j]<s[j-1]){
                int cdoi = s[j];
                 s[j]=s[j-1];
                 s[j-1]=cdoi;
            }
        }
    }
    cout<<s;
}
int main(){

    char s[1000];
    cin>>s;
    sortC(s);
    return 0;
}
