#include<iostream>
using namespace std;

int main(){
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;
    
    int greatest;
    if(a > b){
        if(a > c){
            greatest = a;
        } else {
            greatest = c;
        }
    } else {
        if(b > c){
            greatest = b;
        } else {
            greatest = c;
        }
    }
    
    cout << greatest << " is the greatest" << endl;
    
    return 0;
}
