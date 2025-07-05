#include <bits/stdc++.h>
using namespace std;

int main() {
    int a = 10;
    int* b = &a;
    int** c = &b;

    cout << **c << endl;
    cout << &c << endl;
    cout << *b << endl;
    cout << &b << endl;
    // cout << &&c << endl;

    return 0;
}
