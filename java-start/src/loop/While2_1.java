package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + 1;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
