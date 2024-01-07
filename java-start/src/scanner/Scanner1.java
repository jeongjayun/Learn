package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = scanner.nextLine(); //입력을 String으로 받는다.
        System.out.println("입력한 문자열 = " + s);

        System.out.print("정수를 입력하세요: ");
        int i = scanner.nextInt();
        System.out.println("입력한 정수 = " + i);

        System.out.print("실수를 입력하세요: ");
        double v = scanner.nextDouble();
        System.out.println("입력한 실수 = " + v);
    }
}
