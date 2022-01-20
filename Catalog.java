package com.itea.roman.lection8;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<Book> books = new ArrayList<Book>(){{
        for (int i = 0; i <7 ; i++) {
            add(new Book("Book" + i, "ABC" + i));
        }
        for (int i = 3; i <10 ; i++) {
            add(new Book("Book" + i, "DEF" + i));
        }
        for (int i = 8; i <14 ; i++) {
            add(new Book("Book" + i, "GHI" + i));
        }
    }};

    public static class Book{
        String name;
        String catalogID;
        boolean isTaken;
        StringBuilder history;

        public Book(String name, String catalogID) {
            this.name = name;
            this.catalogID = catalogID;
            isTaken = false;
            history = new StringBuilder();
        }
    }

    public String toString() {
        StringBuilder catalogLog = new StringBuilder();
        for (Book book : books){
            catalogLog.append(book.name);
            catalogLog.append("\r\n");
            catalogLog.append(book.history);
        }

        return catalogLog.toString();
    }
}

