package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        String word;
        if (num % 2 == 0) {
            word = "짝수";
        } else {
            word = "홀수";
        }

        System.out.println("입력한 숫자 " + num + "는 " + word + "입니다.");
    }
}
