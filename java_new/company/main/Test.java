package company.main;

import company.tcs.Calculator;

class Test {
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        int res = calci.add(10,20);
        System.out.println("Result is " + res);
    }
}
