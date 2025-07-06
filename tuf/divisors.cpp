#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 600;

    vector<int> arr;

    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            arr.push_back(i);
            arr.push_back(n / i);
        }
    }

    sort(arr.begin(), arr.end());

    for (auto element : arr) {
        cout << element << ' ';
    }

    return 0;
}
