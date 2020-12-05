package org.sci.books.dto.models;

import java.util.Arrays;
import java.util.Objects;

public abstract class Book {
    private Double pret;
    private String titlu;
    private String ISBN;
    private String[] autori;
    private String editura;




    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(pret, book.pret) &&
                Objects.equals(titlu, book.titlu) &&
                Objects.equals(ISBN, book.ISBN) &&
                Arrays.equals(autori, book.autori) &&
                Objects.equals(editura, book.editura);
    }


    public void whatAmI(){
        System.out.println("I'm a book");
    }

    public Double getPret() {
        return pret;
    }


    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String[] getAutori() {
        return autori;
    }

    public void setAutori(String[] autori) {
        this.autori = autori;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }
}
