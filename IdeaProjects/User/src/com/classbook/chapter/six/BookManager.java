package com.classbook.chapter.six;

import java.util.ArrayList;
import java.util.Arrays;
public class BookManager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);
        int pages = dictionary.pages;
        display(String.valueOf(pages));
        display(dictionary.getBookName());

        Book book = new Book("INB002","James",89);
        display(book.getBookId());
        Book bookdictionary = new Dictionary("INB003","Toms",98,8);
        display(bookdictionary.getBookId());

    }

    public static void display(String content){
        System.out.println(content);
    }
}
