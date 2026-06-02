#include<iostream>
using namespace std;

void butterfly(int n){

    for(int i=1; i<=n; i++){
        for(int j=1; j<=i;j++){
            cout<<"*";
        }
        for(int k=0; k<2*(n-i); k++){
            cout<<" ";
        }
        for(int j=1; j<=i;j++){
            cout<<"*";
        }cout<<endl;
}
    }

void butterfly1(int n){
       
    for(int i=1; i<n; i++){
        for(int j=n; j>i; j--){
            cout<<"*";
        }
        for(int k=2; k<2*(i+1); k++){
            cout<<" ";
        }
        for(int j=n; j>i; j--){
            cout<<"*";
        }
        cout<<endl;
    }
}

int main(){
    int n=5;
    butterfly(n);
    butterfly1(n);
    return 0;
}