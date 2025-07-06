#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    n = n + 1;

    bool arr[n];

    for (int i = 0; i < n; i++) {
        arr[i] = true;
    }

    arr[0] = false;
    arr[1] = false;

    for (int i = 2; i * i < n; i++) {
        if (arr[i] == true) {
            for (int j = i * i; j < n; j = j + i) {
                arr[j] = false;
            }
        }
    }

    for (int i = 0; i <= n; i++) {
        if (arr[i] == true) {
            cout << i << endl;
        }
    }

    return 0;
}