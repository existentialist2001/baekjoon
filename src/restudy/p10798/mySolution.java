package restudy.p10798;

import java.util.Scanner;

public class mySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][15];
        int maxLength = Integer.MIN_VALUE;
        String result ;
        StringBuilder tempStr = new StringBuilder();

        for (int i = 0; i < 5; i++) {

            String input = sc.nextLine();
            int inputLength = input.length();
            input += "*".repeat(15-inputLength);
            arr[i] = input.split("");

            if (inputLength > maxLength) {
                maxLength = inputLength;
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for(int j = 0; j < 5; j++) {

                if (!arr[j][i].equals("*")) {
                    tempStr.append(arr[j][i]);
                }
            }
        }

        result = tempStr.toString();
        System.out.println(result);
    }
}

/*
처음에 String 배열을 15칸으로 선언했어도, 입력 받은 문자열의 길이만큼 채워지고 나머지는 null로 남는 게 아니라, 아예 다른 배열로 참조가 바뀐다.(오개념 가지고 있었음)
그래서 모두 15칸으로 만들어주기 위해 *문자를 부족한만큼 더해주었다.
그리고 15번 검사안하고 최대 길이의 문자열만큼만 검사해주면 되므로 maxLength 변수를 만들어주었고.

찾아본 다른 풀이는 조건문을 넣어줘 인덱스 범위 초과 가능성을 미연에 방지했다.(현재의 나로선 불가능..)
*/
