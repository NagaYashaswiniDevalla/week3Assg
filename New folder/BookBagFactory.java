package factory;

import utils.Constants;

public class BookShelfFactory {

    public BookShelf getBookShelf(String season) {
        switch (season) {
            case Constants.S_ONE_BOOK_RATINGS:
                return new BookShelfOne();
            case Constants.S_TWO_BOOK_RATINGS:
                return new BookShelfTwo();
            case Constants.S_THREE_BOOK_RATINGS:
                return new BookShelfThree();
            case Constants.S_FOUR_BOOK_RATINGS:
                return new BookShelfFour();
            default:
                return null;
        }
    }
}
