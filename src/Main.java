import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] whitePaper = new int[100][100];
        int space = 0;

        int n = sc.nextInt();
        int[][] blackPaper = new int[n][2];

        for (int i = 0; i < n; i++) {

            blackPaper[i][0] = Integer.parseInt(sc.next()) - 1;
            blackPaper[i][1] = Integer.parseInt(sc.next()) - 1;
        }

        //계산
        for (int i = 0; i < n; i++) {

            int rowStart = blackPaper[i][0];
            int rowEnd = rowStart + 10;
            int colStart = blackPaper[i][1];
            int colEnd = colStart + 10;

            for (int r = rowStart; r < rowEnd; r++) {
                for (int c = colStart; c < colEnd; c++) {

                    if (whitePaper[r][c] != 1) {

                        whitePaper[r][c] = 1;
                        space++;
                    }
                }
            }
        }
        System.out.println(space);
       }
    }