#include <bits/stdc++.h>
using namespace std;

int cal_gcd(int a, int b) {
    if (a == 0) {
        return b;
    }

    if (b == 0) {
        return a;
    }

    int rem = a % b;
    while (rem != 0) {
        a = b;
        b = rem;
        rem = a % b;
    }

    return b;
}

int main() {
    int a, b;
    cin >> a >> b;

    int x = cal_gcd(a, b);

    int y = (a * b) / x;

    cout << "GCD of " << a << " and " << b << " is " << x << endl;
    cout << "LCM of " << a << " and " << b << " is " << y << endl;

    return 0;
}

// --------------------------------

// PASS BY REFERENCE

// #include <bits/stdc++.h>
// using namespace std;

// void cal_gcd(int a, int b, int& ans) {
//     if (a == 0) {
//         ans = b;
//         return;
//     }

//     if (b == 0) {
//         ans = a;
//         return;
//     }

//     int rem = a % b;
//     while (rem != 0) {
//         a = b;
//         b = rem;
//         rem = a % b;
//     }

//     ans = b;
//     return;
// }

// int main() {
//     int a, b;
//     cin >> a >> b;

//     int x = -1;

//     cal_gcd(a, b, x);

//     cout << "gcd is " << x << endl;

//     // int y = (a * b) / x;

//     // cout << "GCD of " << a << " and " << b << " is " << x << endl;
//     // cout << "LCM of " << a << " and " << b << " is " << y << endl;

//     return 0;
// }
