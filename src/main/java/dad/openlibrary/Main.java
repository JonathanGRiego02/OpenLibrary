package dad.openlibrary;

import dad.openlibrary.api.OpenLibrary;
import dad.openlibrary.api.SearchResult;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OpenLibrary ol = new OpenLibrary();
        SearchResult result = ol.getBookds("The Lord of the Rings");
        System.out.println(result.getDocs().size());
        System.out.println(result.getDocs().getFirst().getTitle());
    }
}
