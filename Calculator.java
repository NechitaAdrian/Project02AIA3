

public class Calculator {

    public String a;
    public String b;
    public static double PI=3.14;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Calculator(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {}


    @Override
    public String toString() {
        return "Calculator{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

}
