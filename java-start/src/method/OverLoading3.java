package method;

public class OverLoading3 {
    public static void main(String[] args) {
        System.out.println("1 : " + add(3, 5));
        System.out.println("2 : "+ add(1.2, 3.4));
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }


}
