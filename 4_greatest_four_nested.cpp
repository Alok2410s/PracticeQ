#include<iostream>
using namespace std;

int main(){
    int a, b, c, d;
    cout << "Enter four numbers: ";
    cin >> a >> b >> c >> d;
    
    int greatest;
    if(a > b){
        if(a > c){
            if(a > d){
                greatest = a;
            } else {
                greatest = d;
            }
        } else {
            if(c > d){
                greatest = c;
            } else {
                greatest = d;
            }
        }
    } else {
        if(b > c){
            if(b > d){
                greatest = b;
            } else {
                greatest = d;
            }
        } else {
            if(c > d){
                greatest = c;
            } else {
                greatest = d;
            }
        }
    }
    
    cout << greatest << " is the greatest" << endl;
    
    return 0;
}
