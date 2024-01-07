package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue;
        intValue = (int) doubleValue;
        // 내가 변경하려고 형을 직접 넣어주면 명시적 형변환
        System.out.println("intValue = " + intValue);

        System.out.println(10.5);
        System.out.println((int)10.5);
    }
}
