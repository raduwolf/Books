package org.sci.books.dto.models;

import java.util.Objects;

public class ArtAlbumDto extends Book{
    private String paperQuality;

    public ArtAlbumDto() {

    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArtAlbumDto artAlbum = (ArtAlbumDto) o;
        return Objects.equals(paperQuality, artAlbum.paperQuality);
    }

    public void whatAmI(){
        System.out.println("I'm a book but I'm also art album");
        System.out.println("This is my paper:"+paperQuality);
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
