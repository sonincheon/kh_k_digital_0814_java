package Arrays검색;
import java.util.Arrays;
import java.util.Scanner;
// 검색을 위해서는 사전에 정렬이 되어 있어야 한다.
public class ArraysSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * num) + 1;
        }
        Arrays.sort(arr);
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        int result = Arrays.binarySearch(arr, key); // 정렬되있는 배열을 이분 검색, binarySearch 정렬이 되있어야 사용가능
        if (result >= 0) {
            System.out.println(result); // 인덱스가 넘어옴

        } else {
            System.out.println("찾는 값이 없습니다.");
        }
    }
}