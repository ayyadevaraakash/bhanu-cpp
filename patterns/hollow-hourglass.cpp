#include <bits/stdc++.h>
using namespace std;

int main() {
    int rows = 9;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i - 1; j++) {
            cout << " ";
        }
        for (int j = 1; j <= rows - i + 1; j++) {
            if (i == 1 or j == 1 or j == rows - i + 1) {
                cout << "* ";
            } else {
                cout << "  ";
            }
        }
        cout << endl;
    }

    for (int i = 2; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            cout << " ";
        }
        for (int j = 1; j <= i; j++) {
            if (i == rows or j == 1 or j == i) {
                cout << "* ";
            } else {
                cout << "  ";
            }
        }
        cout << endl;
    }

    return 0;
}