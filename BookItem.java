package ismek.maverakutuphanesi;

import java.io.Serializable;

public class BookItem implements Serializable {

    private String bookName;
    private int coverPhoto;

    public String getBookName() {
        return bookName;
    }

    public BookItem() {

    }

    public BookItem(String bookName, int coverPhoto) {
        this.bookName = bookName;
        this.coverPhoto = coverPhoto;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(int coverPhoto) {
        this.coverPhoto = coverPhoto;
    }
}
