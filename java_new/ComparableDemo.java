import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

//    @Override
//    public int compareTo(Student secondStudent) {
//        Student firstStudent = this;
////        return secondStudent.name.compareTo(firstStudent.name);
//        return Integer.compare(secondStudent.roll, firstStudent.roll);
//    }

    @Override
    public int compareTo(Student secondStudent) {
        Student firstStudent = this;
        int result = secondStudent.name.compareTo(firstStudent.name);
        if (result == 0) {
            return Integer.compare(firstStudent.roll, secondStudent.roll);
        } else {
            return result;
        }
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Student s1 = new Student("vijay", 10);
        Student s2 = new Student("vijay", 1);
        Student s3 = new Student("akash", 5);
        Student s4 = new Student("aman", 7);

        List<Student> ds = new ArrayList<>();
        ds.add(s1);
        ds.add(s2);
        ds.add(s3);
        ds.add(s4);

        Collections.sort(ds);

        for (Student x : ds) {
            System.out.println(x.name + " " + x.roll);
        }
    }
}
