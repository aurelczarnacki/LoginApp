package com.company;

import java.util.Scanner;

public class Main {

    private static User[] users = {
            new User("admin", "123", "sekret"),
            new User("suchy", "qwerty", "sekret"),
            new User("aurel", "haslo", "sekret"),
            new User("maciek", "password", "sekret"),
            new User("Vi", "asdf", "sekret")
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj login: ");
        String username = scanner.nextLine();
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        for(int i = 0; i < users.length; i++){
            User user = users[i];
            if (user.authenticate(username, password)) {
                System.out.println("Witaj, " + username);
                break;
            }
        }


    }
}

