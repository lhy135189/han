package com.classbook.chapter.six;

public class Dictionary extends Book {
    private int definitions;

    public Dictionary(int definitions) {
        this.definitions = definitions;
    }

    public Dictionary(String bookId, String bookName, int pages, int definitions) {
        super(bookId, bookName, pages);
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }


    public String getBookId(){
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}