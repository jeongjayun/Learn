package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int max;
        if (num > num2) {
            max = num;
            System.out.println("큰 값은 " + max);
        } else if (num == num2) {
            System.out.println("두 수는 같습니다.");
        } else {
            max = num2;
            System.out.println("큰 값은 " + max);
        }
    }
}
