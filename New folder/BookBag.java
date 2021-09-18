package factory;

abstract public class BookShelf {
    String season;
    String bookRatings;
    String purpose;
    String size;

    public BookShelf() {
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getBookRatings() {
        return this.bookRatings;
    }

    public void setBookRatings(String BookRatings) {
        this.bookRatings = bookRatings;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BookShelf season(String season) {
        setSeason(season);
        return this;
    }

    public BookShelf bookRatings(String bookRatings) {
        setBookRatings(bookRatings);
        return this;
    }

    public BookShelf purpose(String purpose) {
        setPurpose(purpose);
        return this;
    }

    public BookShelf size(String size) {
        setSize(size);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " season='" + getSeason() + "'" + ", bookRatings='" + getBookRatings() + "'" + ", purpose='"
                + getPurpose() + "'" + ", size='" + getSize() + "'" + "}";
    }

}