// STYLE 3

import java.util.*;

class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name + " " + roll;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("akash", 24);
        Student s2 = new Student("bhanu", 2);
        Student s3 = new Student("nagurbabu", 5);

//        List<Student> ds = List.of(s1, s2, s3);
        List<Student> ds = Arrays.asList(s1, s2, s3);

//        MyRule obj = new MyRule();
//        Collections.sort(ds, (firstStudent, secondStudent) -> Integer.compare(firstStudent.roll, secondStudent.roll));

        Collections.sort(ds, (o1, o2) -> o1.name.compareTo(o2.name));

//        Collections.sort(ds, (a, b) -> Integer.compare(a.roll, b.roll));

        List<Integer> ds1 = List.of(12, 54, 78, 34);

        System.out.println(ds1);
        System.out.println(ds);
    }
}

// STYLE 2

//import java.util.*;
//
//class Student {
//    String name;
//    int roll;
//
//    public Student(String name, int roll) {
//        this.name = name;
//        this.roll = roll;
//    }
//
//    @Override
//    public String toString() {
//        return name + " " + roll;
//    }
//}
//
//public class ComparatorDemo {
//    public static void main(String[] args) {
//        Student s1 = new Student("akash", 24);
//        Student s2 = new Student("bhanu", 2);
//        Student s3 = new Student("nagurbabu", 5);
//
////        List<Student> ds = List.of(s1, s2, s3);
//        List<Student> ds = Arrays.asList(s1, s2, s3);
//
////        MyRule obj = new MyRule();
//        Collections.sort(ds, new Comparator<Student>(){
//            @Override
//            public int compare(Student firstStudent, Student secondStudent) {
//                return Integer.compare(firstStudent.roll, secondStudent.roll);
//            }
//        });
//
//        List<Integer> ds1 = List.of(12, 54, 78, 34);
//
//        System.out.println(ds1);
//        System.out.println(ds);
//    }
//}
//


// STYLE 1

//import java.util.*;
//
//class Student {
//    String name;
//    int roll;
//
//    public Student(String name, int roll) {
//        this.name = name;
//        this.roll = roll;
//    }
//
//    @Override
//    public String toString() {
//        return name + " " + roll;
//    }
//}
//
//class MyRule implements Comparator<Student> {
//    @Override
//    public int compare(Student firstStudent, Student secondStudent) {
//        return Integer.compare(firstStudent.roll, secondStudent.roll);
//    }
//}
//
//public class ComparatorDemo {
//    public static void main(String[] args) {
//        Student s1 = new Student("akash", 24);
//        Student s2 = new Student("bhanu", 2);
//        Student s3 = new Student("nagurbabu", 5);
//
////        List<Student> ds = List.of(s1, s2, s3);
//        List<Student> ds = Arrays.asList(s1, s2, s3);
//
//        MyRule obj = new MyRule();
//        Collections.sort(ds, obj);
//
//        List<Integer> ds1 = List.of(12, 54, 78, 34);
//
//        System.out.println(ds1);
//        System.out.println(ds);
//    }
//}
