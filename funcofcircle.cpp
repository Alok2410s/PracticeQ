#include<iostream>
using namespace std;

void calArea(float &area, int r){
    area = 3.1456 * r * r;
    
}

int main(){

    float area;
    int r;

    cout<<"Enter the radius of circle: ";
    cin>>r;

    calArea(area, r);
    cout<<"Area of circle is "<<area<<endl;

}
