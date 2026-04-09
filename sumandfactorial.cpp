#include<iostream>
using namespace std;

void calsum(int &sum, int a, int b){
    sum += a + b;
}

void calfact(int &fact, int a){
    fact *= a;
}

int main(){

    int sum=0;
    int fact=1;
    int a, b;

    for(int i=1; i<a; i++){
        cout<<"Enter two numbers ";
        cin>>a>>b;
        calsum(sum, a, b); 
        calfact(fact, a);

        cout<<"Sum is "<<sum<<endl;
        cout<<"Factorial is "<<fact<<endl;
    }

}