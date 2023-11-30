package oopgame;

import java.util.Scanner;

public interface UserNameInput {
    default String askUserName() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}