package restudy.p10798;

import java.util.Scanner;

public class anotherSolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //5줄의 입력을 받을 배열 생성
        String[] input = new String[5];

        //입력 받기
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextLine();
        }

        //최대 15글자이므로 15번까지 세로로 읽기
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                // 현재 문자열 길이 내에 있는 경우에만 출력
                if (i < input[j].length()) {
                    System.out.print(input[j].charAt(i));
                }
            }
        }
    }
}
