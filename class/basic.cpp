#include <bits/stdc++.h>
using namespace std;

class Student {
   public:
    int roll;
    string name;

    Student(int _roll, string _name) {
        roll = _roll;
        name = _name;
    }
};

int main() {
    // Student s1 {12, "bhanu"};

    // cout << s1.roll << " and " << s1.name << endl;

    Student* s1 = new Student(14, "bhanu");

    cout << s1->roll << " and " << s1->name << endl;

    return 0;
}
