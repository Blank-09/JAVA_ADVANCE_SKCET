#include <iostream>
using namespace std;

class Wall {
private:
    double length, height;

public:
    Wall(double length, double height) {
        this->length = length;
        this->height = height;
    }
    
    double calculateArea() {
        return length * height;
    }
};

int main() {
    double l1, l2, h1, h2;
    cin >> l1 >> h1 >> l2 >> h2;
    
    Wall w1(l1, h1), w2(l2, h2);
    
    cout << "Area of Wall 1: " <<  w1.calculateArea() << endl;
    cout << "Area of Wall 2: " <<  w2.calculateArea() << endl;
}