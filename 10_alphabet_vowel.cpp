#include<iostream>
using namespace std;

int main(){
    char ch;
    cout << "Enter a character: ";
    cin >> ch;
    
    if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            cout << ch << " is an alphabet and a vowel" << endl;
        } else {
            cout << ch << " is an alphabet but a consonant" << endl;
        }
    } else {
        cout << ch << " is not an alphabet" << endl;
    }
    
    return 0;
}
