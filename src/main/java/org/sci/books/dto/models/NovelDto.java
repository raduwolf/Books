package org.sci.books.dto.models;

import java.util.Objects;

public class NovelDto extends Book {
    private String type;

    public NovelDto() {

        super();
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NovelDto novelDto = (NovelDto) o;
        return Objects.equals(type, novelDto.type);
    }
    @Override
    public void whatAmI() {
        System.out.println("I'm a book but I'm also a novel");
        System.out.println("This is my type:" + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
