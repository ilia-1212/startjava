package com.startjava.lesson_final.books;

public class BookShell {
    private static int amountBooks;
    private static Book[] books = new Book[10];

    public static void addBook(String bookInfo) {
        int index = findBookIndex(bookInfo);
        if (index == -1) {
            String[] bookRecord = bookInfo.split(" ");
            books[amountBooks++] = new Book(bookRecord[0], bookRecord[1], bookRecord[2]);
            System.out.println("Добавляем книгу в ячейку: " + amountBooks);
        } else System.out.println("Книга с таким автором ,названием и годом печати уже есть");
    }

    public static void delBook(String bookInfo) {
        int index = findBookIndex(bookInfo);
        if (index != -1) {
            books[index] = null;
            System.out.println("удаляем книгу из ячейки: " + (index + 1));
            amountBooks--;
        } else System.out.println("Книга с таким автором ,названием и годом печати не найдена или уже удалена");
    }

    public static void findBook(String bookInfo) {
        int index = findBookIndex(bookInfo);
        if (index == -1) System.out.println("Книга с таким автором ,названием и годом печати не найдена");
        else System.out.println("Книга с таким автором ,названием и годом печати найдена, лежит в ячейке: " + (index + 1));
    }

    public static void showInfoAllBooks() {
        System.out.println("Всего книг: " + amountBooks);
        for(int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].toString());
            }
        }
    }

    public static void showFreeSpaces() {
        System.out.println("Всего пустых ячеек: " + (books.length - amountBooks));
    }

    public static void showShell() {
        String result = "";
        System.out.println("Книжная полка");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                result = "[]";
            } else {
                result = "[K]";
            }
            System.out.print(result);
        }
        System.out.print("\n");
    }

    private static int findBookIndex(String bookInfo) {
        String[] bookData = bookInfo.split(" ");
        for(int i = 0; i < books.length; i++) {
            if (books[i] != null && (books[i].getAuthor()).equals(bookData[0]) && (books[i].getTitle()).equals(bookData[1]) && (books[i].getYearPublish()).equals(bookData[2])) return i;
        }
        return -1;
    }
}
