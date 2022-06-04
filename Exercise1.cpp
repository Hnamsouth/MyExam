#include<iostream>
using namespace std;
// nhap vao so nguyen co 3 chu so vaf in ra cach doc cua so do
int main(){

    int shc;
    do{
    cin>>shc;
    }
    while(shc<100 || shc>999);
    // cout<<shc;
    // x1 hang don vi, x2 hang chuc , x3 hang tram
    int x1,x2,x3;
    x1=shc%10;
    x2=(shc/10)%10;
    x3=shc/100;
    // cout<<x1<<x2<<x3;

    switch (x3)
    {
        case 1: cout<<"mot tram "; break;
        case 2: cout<<"hai tram "; break;
        case 3: cout<<"ba tram "; break;
        case 4: cout<<"bon tram "; break;
        case 5: cout<<"nam tram "; break;
        case 6: cout<<"sau tram "; break;
        case 7: cout<<"bay tram "; break;
        case 8: cout<<"tam tram "; break;
        case 9: cout<<"chin tram "; break;
    }
    switch (x2)
    {
        case 0: if(x1>0){cout<<"le ";} break;
        case 1: cout<<"muoi "; break;
        case 2: cout<<"hai muoi "; break;
        case 3: cout<<"ba muoi "; break;
        case 4: cout<<"bon muoi "; break;
        case 5: cout<<"nam muoi "; break;
        case 6: cout<<"sau muoi "; break;
        case 7: cout<<"bay muoi "; break;
        case 8: cout<<"tam muoi "; break;
        case 9: cout<<"chin muoi "; break;
    }
    switch (x1)
    {
        case 1: cout<<"mot"; break;
        case 2: cout<<"hai"; break;
        case 3: cout<<"ba"; break;
        case 4: cout<<"bon"; break;
        case 5: cout<<"nam"; break;
        case 6: cout<<"sau"; break;
        case 7: cout<<"bay"; break;
        case 8: cout<<"tam"; break;
        case 9: cout<<"chin"; break;
    }
    
    for(int i=1;i<10;i++){
        if(i==1){

        }
    }
    
    
    return 0;
}
