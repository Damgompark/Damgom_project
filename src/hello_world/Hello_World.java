package hello_world;

import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("당신의 이름은? ");
        name = scanner.next();

        scanner.close();

        if(name.equals("박유진"))
            System.out.println("안녕");
        else if(name.equals("Parkyujin"))
            System.out.println("Hello");
        else System.out.println("오류");

    }
}
