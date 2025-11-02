class Calculator<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Calculator<Integer> ds = new Calculator<>();
        ds.setValue(45);
        Calculator<String> ds1 = new Calculator<>();
        ds1.setValue("akash");

        System.out.println(ds.getValue());
        System.out.println(ds1.getValue());
    }
}
