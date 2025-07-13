#include <bits/stdc++.h>
using namespace std;

bool is_valid(int mid, vector<int>& arr) {
    if (arr[mid] == 0) {
        return true;
    } else {
        return false;
    }
}

int main() {
    // find first 0

    // int arr[n] = {0,0,0,1,1,1,1,1,1,1};
    vector<int> arr = {0, 0, 0, 0, 1, 1, 1, 1, 1};

    int low = 0, high = arr.size() - 1;

    int ans = -1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (is_valid(mid, arr) == true) {
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    cout << ans << endl;

    return 0;
}