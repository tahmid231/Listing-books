/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listmain;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}

public class Listmain {
    public static void main(String[] args) {
        
        Book book1 = new Book("BookX", "AuthorX", 2010, "GenreX");
        Book book2 = new Book("BookY", "AuthorY", 2012, "GenreY");
        Book book3 = new Book("BookZ", "AuthorZ", 2020, "GenreZ");

        
        List<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);

        System.out.println("ArrayList:");
        displayBooks(bookArrayList);

        
        bookArrayList.remove(book2);
        System.out.println("ArrayList after deleting a book:");
        displayBooks(bookArrayList);

        
        List<Book> bookLinkedList = new LinkedList<>();
        bookLinkedList.add(book1);
        bookLinkedList.add(book2);
        bookLinkedList.add(book3);

        System.out.println("LinkedList:");
        displayBooks(bookLinkedList);

        
        bookLinkedList.remove(book2);
        System.out.println("LinkedList after deleting a book:");
        displayBooks(bookLinkedList);

        
        System.out.println("ArrayList size: " + bookArrayList.size());
        System.out.println("LinkedList size: " + bookLinkedList.size());

        bookArrayList.clear();
        bookLinkedList.clear();

        System.out.println("ArrayList size after deleting: " + bookArrayList.size());
        System.out.println("LinkedList size after deleting: " + bookLinkedList.size());

        bookArrayList.add(book1);
        bookLinkedList.add(book1);

        System.out.println("ArrayList have bookX: " + bookArrayList.contains(book1));
        System.out.println("LinkedList have bookX: " + bookLinkedList.contains(book1));
    }

    public static void displayBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
