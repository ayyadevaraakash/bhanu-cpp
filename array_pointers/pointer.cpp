#include <bits/stdc++.h>
using namespace std;

int main() {
    int a = 5;

    int* ptr = &a;

    // address of A
    cout << ptr << endl;

    // value of A
    cout << *ptr << endl;

    // address of ptr
    cout << &ptr << endl;

    // address of A
    cout << &a << endl;

    return 0;
}
