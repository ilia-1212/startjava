package com.startjava.lesson_final.books;

public class BookShell {
    private static int amountBooks;
    private static Book[] books = new Book[10];

    private static int findRecord(String bookInfo) {
        String[] bookRecord;
        bookRecord = bookInfo.split(" ");
        for(int i = 0; i < books.length; i++) {
            if (books[i] != null && (books[i].getAuthor()).equals(bookRecord[0]) && (books[i].getTitle()).equals(bookRecord[1]) && (books[i].getYearPublish()).equals(bookRecord[2])) return i;
        }
        return -1;
    }

    public static void addBook(String bookInfo) {
        int key = findRecord(bookInfo);
        if (key == -1) {
            String[] bookRecord = bookInfo.split(" ");
            books[amountBooks++] = new Book(bookRecord[0], bookRecord[1], bookRecord[2]);
            System.out.println("Добавляем книгу в ячейку: " + amountBooks);
        } else System.out.println("Книга с таким автором ,названием и годом печати уже есть");
    }

    public static void delBook(String bookInfo) {
        int key = findRecord(bookInfo);
        if (key != -1) {
            books[key] = null;
            System.out.println("удаляем книгу из ячейки: " + (key + 1));
        } else System.out.println("Книга с таким автором ,названием и годом печати не найдена или уже удалена");
    }

    public static void findBook(String bookInfo) {
        int key = findRecord(bookInfo);
        if (key == -1) System.out.println("Книга с таким автором ,названием и годом печати не найдена");
        else System.out.println("Книга с таким автором ,названием и годом печати найдена, лежит в ячейке: " + (key + 1));
    }

    public static void showTotalAmountBooks() {
        System.out.println("Всего книг: " + amountBooks);
    }

    public static void showFreeSpaces() {
        System.out.println("Всего пустых ячеек: " + (books.length - amountBooks));
    }

    public static void showShell() {
        String result = "";
        System.out.println("Книжная полка");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                //result = "< >";
                result = "[]";
            } else {
                //result = books[i].toString();
                result = "[K]";
            }
            System.out.print(result);
        }
        System.out.print("\n");
    }
}
