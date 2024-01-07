package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        //2*3 2차원 배열 만든다
        int[][] arr = new int[2][3]; //행 2, 열 3
        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        for (int row = 0; row < 2; row++) {
            //행 출력
            for(int column=0; column<3; column++) {
                //열 출력
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝날 때마다 줄바꾸기
        }
    }
}
