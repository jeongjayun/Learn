package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //students 배열의 크기 : 5


        //변수 값 대입
        students[0] = 90; //배열은 0부터 시작
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        students[5] = 40;

        //변수 값 출력
        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);;
    }
}
