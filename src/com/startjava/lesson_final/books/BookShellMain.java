package com.startjava.lesson_final.books;

import java.util.Scanner;

public class BookShellMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userAnswer = "";
        BookShell bookShell = new BookShell(10);
            do {
                bookShell.showShell();
                showMenu();
            } while (checkMenu((userAnswer = scanner.nextLine()), bookShell) && !userAnswer.equals("6"));
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("---Menu---");
        System.out.println("    1. добавить");
        System.out.println("    2. удалить");
        System.out.println("    3. найти");
        System.out.println("    4. показать информацию по всем книгам");
        System.out.println("    5. показать количество свободного места");
        System.out.println("    6. выход");
        System.out.println(">>>Menu<<<");
    }

    private static boolean checkMenu(String menuItem, BookShell bookShell) {
        boolean result = (menuItem.equals("1") ||
                menuItem.equals("2") ||
                menuItem.equals("3") ||
                menuItem.equals("4") ||
                menuItem.equals("5") ||
                menuItem.equals("6"));

            switch (menuItem) {
                case "1" -> {
                    System.out.print("введите через пробел параметры книги (автор, название, год издания): ");
                    bookShell.addBook(scanner.nextLine());
                }
                case "2" -> {
                    System.out.print("введите через пробел параметры книги (автор, название, год издания): ");
                    bookShell.delBook(scanner.nextLine());
                }
                case "3" -> {
                    System.out.print("введите через пробел параметры книги (автор, название, год издания): ");
                    bookShell.findBook(scanner.nextLine());
                }
                case "4" -> bookShell.showInfoAllBooks();
                case "5" -> bookShell.showFreeSpaces();
                case "6" -> System.out.println("Выходим...");
                default -> System.out.println("Неверный выбор, используйте только цифры 1-6");
            };
            System.out.print("\n");
        return result;
    }
}
