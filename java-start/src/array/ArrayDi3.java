package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2*3 2차원 배열 만든다
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        }; //행 2, 열 3

        for (int row = 0; row < arr.length; row++) {
            //행 출력
            for(int column=0; column<arr[row].length; column++) {
                //열 출력
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝날 때마다 줄바꾸기
        }
    }
}
