package restudy.p2941;

import java.util.Scanner;

public class mySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input =sc.nextLine();

        //크로아티아 알파벳을 먼저 찾고, 찾은 알파벳을 제거해 주고, 나머지는 중복 생각할 필요 없이 length로 접근하면 될 듯
        //반대로 length로 먼저 접근 한 다음 찾은 크로아티아 알파벳만큼 빼주기

        //크로아티아 알파벳 패턴, 문자 3개 패턴이 배열의 앞에 있어야 함, 안그러면 dz=인데 z=으로 결과가 왜곡됨
        String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        int result = input.length();

        for (int i = 0; i < croAlpha.length; i++) {

            String target = croAlpha[i];

            int isFound = input.indexOf(target);

            while (isFound != -1) {

                result = result - target.length() + 1;

                //찾았으면 그 알파벳을 제거해줌, 이후 처음 ~ 그 알파벳 전까지, 그 알파벳 후 ~ 끝까지 더해주기
                //더해줄 때, 더해서 새로운 패턴이 나타나지 않게 사이에 공백 문자 넣어줬음
                input = input.substring(0,isFound).concat(" ").concat(input.substring(isFound + target.length()));

                //더 있는 지 다시 찾음
                isFound = input.indexOf(target);
            }
        }

        System.out.println(result);
    }
}

/* subString 함수, 해당 문자열에서 인자만큼 남기는 거지, 인자만큼 제거하는 게 아님*/