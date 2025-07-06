#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 459;

    int cnt = 0;

    while (n != 0) {
        cnt++;
        n = n / 10;
    }

    cout << cnt << endl;

    return 0;
}