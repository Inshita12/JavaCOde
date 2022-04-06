package code;
abstract class demo {
    public int a;

    demo() {
        a = 10;
    }

    abstract public void set(int a);

    abstract public void get();

}

class Example extends demo {

    public void set(int a) {
        this.a = a;
    }

    public void get() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.set(20);
        obj.get();
    }
}