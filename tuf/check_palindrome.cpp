#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    int b = 0, n = s.size() - 1;

    bool check = true;

    while (b != n) {
        if (s[b] != s[n]) {
            check = false;
            break;
        }
        b++;
        n--;
    }

    if (check == true) {
        cout << "palindrome";
    } else {
        cout << "not palindrome";
    }
}

// #include <bits/stdc++.h>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     int backup = n;

//     int res = 0;

//     while (n != 0) {
//         int rem = n % 10;
//         res = res * 10 + rem;
//         n = n / 10;
//     }

//     if (res == backup) {
//         cout << "palindrome";
//     } else {
//         cout << "not palindrome";
//     }

//     return 0;
// }