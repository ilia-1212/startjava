package com.startjava.lesson_final.books;

import com.startjava.lesson_final.books.BookShell;

import java.util.Scanner;

public class BookShellMain {
    private static String userAnswer = "";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (!userAnswer.equals("6")) {
            do {
                BookShell.showShell();
                showMenu();
            } while (!checkMenu(scanner.nextLine()));
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("---Menu---");
        System.out.println("    1. добавить");
        System.out.println("    2. удалить");
        System.out.println("    3. найти");
        System.out.println("    4. показать все книги");
        System.out.println("    5. показать свободное место");
        System.out.println("    6. выход");
        System.out.println(">>>Menu<<<");
    }

    private static boolean checkMenu(String itemMenu) {
        boolean result = ((userAnswer = itemMenu).equals("1") ||
                userAnswer.equals("2") ||
                userAnswer.equals("3") ||
                userAnswer.equals("4") ||
                userAnswer.equals("5") ||
                userAnswer.equals("6"));
        if (result) {
            process(userAnswer);
        } else System.out.println("только цифры 1-6");

        return result;
    }

    private static void process(String itemMenu) {
        switch (itemMenu) {
            case "1" -> {
                System.out.print("введите через пробел параметры книги (автор, название, год издания): ");
                BookShell.addBook(scanner.nextLine());
            }
            case "2" -> {
                System.out.print("введите через пробел параметры книги (автор, название, год издания): ");
                BookShell.delBook(scanner.nextLine());
            }
            case "3" -> {
                System.out.print("введите через пробел параметры книги (автор, название, год издания): ");
                BookShell.findBook(scanner.nextLine());
            }
            case "4" -> BookShell.showTotalAmountBooks();
            case "5" -> BookShell.showFreeSpaces();
            default -> System.out.println("выходим...");
        };
    }
}
