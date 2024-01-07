package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8 : a = a + 3;
        a -= 2; // 6 : a = 8 - 2;
        a *= 4; // 24 : a = 6 * 4;
        a /= 3; // 8 : a = 24 / 3;
        a %= 5; // 3 : a = 8 % 5;
        System.out.println(a);
    }
}
