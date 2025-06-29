#include <bits/stdc++.h>
using namespace std;

int lcm_team(int a, int b) {
    for (int c = max(a, b); c <= a * b; c++) {
        if (c % a == 0 and c % b == 0) {
            return c;
        }
    }
    return -1;
}

int gcd_team(int a, int b) {
    for (int c = min(a, b); c >= 1; c--) {
        if (a % c == 0 and b % c == 0) {
            return c;
        }
    }
    return -1;
}

int main() {
    int a;
    int b;

    cin >> a >> b;

    int x = lcm_team(a, b);
    int y = gcd_team(a, b);

    cout << "LCM of " << a << " and " << b << " is " << x << endl;
    cout << "GCD of " << a << " and " << b << " is " << y << endl;

    return 0;
}
