import factory.BookShelfFactory;
import factory.BookShelf;
import factory.BookShelfStore;
import utils.Constants;

public class Main {

    private static Object Constants;

    public static <BookShelfFactory, BookShelfStore, BookShelf> void main(String[] args) {
        BookShelfFactory factory = new BookShelfFactory();

        String season = Constants.S_FOUR_BOOK_RATINGS;
        String size = Constants.DOUBLE_SIZE;
        String bookRatings = Constants.COMFORT_BOOK_RATINGS;

        BookShelfStore store = new BookShelfStore(factory);
        BookShelf shelf = store.orderBookShelf(season, size, bookRatings);
        System.out.println(shelf);
    }
}
