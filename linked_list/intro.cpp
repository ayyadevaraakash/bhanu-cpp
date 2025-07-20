#include <bits/stdc++.h>
using namespace std;

class Node {
   public:
    int data;
    Node* next;

    Node(int _data) {
        data = _data;
    }
};

int main() {
    Node* x = new Node(12);

    Node* y = new Node(16);

    x->next = y;

    cout << x->data << endl;
    cout << x->next->data << endl;

    return 0;
}
