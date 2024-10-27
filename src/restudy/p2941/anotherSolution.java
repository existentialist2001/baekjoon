package restudy.p2941;

import java.util.Scanner;

public class anotherSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //크로아티아 알파벳 배열
        String[] croatiaAlphabets = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        //크로아티아 알파벳을 하나의 문자로 치환
        for (String croatia : croatiaAlphabets) {
            input = input.replace(croatia, "!");
        }

        System.out.println(input.length());
    }
}

/*
크로아티아 알파벳을 하나의 문자로 치환한 다음 문자열의 길이를 잰다는 핵심 아이디어
replcae함수, 해당 문자열에 인자로 들어간 패턴이 없다면? -> 그러면 해당 문자열을 그대로 반환하기 때문에 안전하게 사용할 수 있음
*/
