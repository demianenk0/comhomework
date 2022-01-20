package com.itea.roman.lection7;

public class Books {
    private static Object Books;

    public static void main(String[] args) {
        Book book1 = new Book("Монах, который продал свой «феррари» -", "Робин Шарма -", "Harper Collins -", 500.0);
        Book book2 = new Book("Самый богатый человек в Вавилоне -", "Джордж Самюэль Клейсон -", "Андронум -", 100.0);
        Book book3 = new Book("Жёсткий менеджмент -", "Дэн Кеннеди -", "Альпина Паблишер -", 150.0);
        String BookName = book1.getName();
        String BookAuthor = book1.getAuthor();
        String BookPublisher = book1.getPublisher();
        double BookPrice = book1.getPrice();
        System.out.println(BookName + " " + BookAuthor + " " + BookPublisher + " " + BookPrice);
    }
}

class Book{
    private String Name;
    private String Author;
    private String Publisher;
    private double Price;

    public Book(String Name, String Author, String Publisher, double Price) {
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public double getPrice() {
        if (Price > 10) {
            return Price;
        } else {
            System.out.println("Цена должна быть больше 10!");
        }
        return 10;
    }
}



