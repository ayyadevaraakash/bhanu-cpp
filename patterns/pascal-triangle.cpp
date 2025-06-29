#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 5;
    int prev = -1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            cout << " ";
        }
        for (int j = 1; j <= i; j++) {
            if (j == 1) {
                cout << 1 << " ";
                prev = 1;
            } else {
                int num = prev * (i - j + 1);
                int den = j - 1;
                int ans = num / den;
                cout << ans << " ";
                prev = ans;
            }
        }
        cout << endl;
    }

    return 0;
}