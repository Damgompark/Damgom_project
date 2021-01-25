package hello_world;

/*
1. 홀수 짝수 구분
if(zool % 2 == 1) // zool은 홀수
2. 다이아몬드
 */
import java.util.Scanner;
//1. 왼쪽별찍기 + 스캐너
public class Starkokkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zool;
        zool = sc.nextInt();

        for (int i = 0; i < zool; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //2-1. 오른쪽 별찍기
        for (int u = 1; u <= 5; u++) { // u = 줄의 수, u는 5보다 작거나 같을때까지 = 줄갯수는 5개
            for (int w = 5; w > 0; w--) { // w = 공백의 수, 공백을 5개부터 0까지 1개씩 줄여나감
                if (w > u) { //만약 공백 수가 줄 수보다 크면 공백을 출력하고
                    System.out.print(" ");

                } else { // 그 외의 모든 상황은 *를 출력한다.
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        int zool;
        zool = sc.nextInt();
        for (int q = 1; q <= zool; q++) {
            for (int m = zool; m > 0; m--) {
                sc.close();

                if (m > q) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
        }
    }