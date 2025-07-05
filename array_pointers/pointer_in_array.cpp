#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 5;
    // int arr[n] = {12, 5, 64, 96, 1};
    int arr[n];

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int k = 0; k < n; k++) {
        cout << arr[k] << " ";
    }
    cout << endl;

    int* ptr = arr;

    for (int k = 0; k < n; k++) {
        cout << ptr + k << " ";
    }
    cout << endl;

    for (int k = 0; k < n; k++) {
        cout << *(ptr + k) << " ";
    }
    cout << endl;

    return 0;
}

// *ptr + 1 is not equal to *(ptr + 1)