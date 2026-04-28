//WAP for iterate 
//Iteration means repeating a set of instructions again and again until a condition is met.
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    
    cout << "Iterating from 1 to " << n << ":\n";
    for (int i = 1; i <= n; i++) {
        cout << i << " ";
    }
    cout << endl;
    
    return 0;
} 