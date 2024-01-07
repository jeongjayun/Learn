package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //2*3 2차원 배열 만든다
        int[][] arr = new int[5][5];

        int i=1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

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
