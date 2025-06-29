#include <bits/stdc++.h>
using namespace std;

int main() {
    int num;
    cin >> num;

    // for (int den = 2; den < num; den++) {
    //     if (num % den == 0) {
    //         cout << "not prime because of " << den << endl;
    //         return 0;
    //     }
    // }

    // for (int den = 2; den <= num / 2; den++) {
    //     if (num % den == 0) {
    //         cout << "not prime because of " << den << endl;
    //         return 0;
    //     }
    // }

    // den <= sqrt(num)
    // den * den <= num

    for (int den = 2; den * den <= num; den++) {
        if (num % den == 0) {
            cout << "not prime because of " << den << endl;
            return 0;
        }
    }

    cout << "prime number" << endl;

    return 0;
}

// loops

/*

for (initialization ; condition ; increment/decrement) {
    // body
}

initialization will only happen once
but condition and increment/decrement will happen in all iterations

*/