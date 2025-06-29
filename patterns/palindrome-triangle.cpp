#include <bits/stdc++.h>
using namespace std;

int main() {
    int rows = 9;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            cout << " ";
        }
        int number = i;
        for (int j = 1; j <= i; j++) {
            cout << number;
            number--;
        }

        number = 2;
        for (int j = 1; j <= i - 1; j++) {
            cout << number;
            number++;
        }

        // next row
        cout << endl;
    }

    return 0;
}
