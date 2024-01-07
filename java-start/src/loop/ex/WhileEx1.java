package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count=1;
/*        //while 사용 - 내가 푼 문제
        while(true){
            System.out.println(count);
            if (count == 10) {
                break;
            }
            count++;
        }*/

        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }
}
