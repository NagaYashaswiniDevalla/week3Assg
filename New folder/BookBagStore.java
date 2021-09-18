package factory;

public class BookShelfStore {
    BookShelfFactory factory;

    public BookShelfStore(BookShelfFactory factory) {
        this.factory = factory;
    }

    public BookShelf orderBookShelf(String season, String size, String bookRatings) {

        BookShelf bag = factory.getBookShelf(season);

        shelf.setSize(size);
        shelf.setBookRatings(bookRatings);

        return shelf;

    }

}