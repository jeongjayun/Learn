package variable;

public class Var5 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println("a = " + a);

        // 2. 변수 선언과 초기화를 한번에
        int b = 2;
        System.out.println("b = " + b);

        // 3. 여러 변수를 한번에 선언, 초기화
        int c = 3, d = 4, e = 5;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
