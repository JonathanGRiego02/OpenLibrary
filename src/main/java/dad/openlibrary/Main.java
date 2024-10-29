package dad.openlibrary;

import dad.openlibrary.api.Doc;
import dad.openlibrary.api.OpenLibrary;
import dad.openlibrary.api.SearchResult;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OpenLibrary ol = new OpenLibrary();
        SearchResult result = ol.getBookds("The Lord of the Rings");

        System.out.println("Se han encontrado " + result.getNumFound() + " libros");

        Doc doc = result.getDocs().getFirst();

        System.out.println("--- Primer Libro ---");
        System.out.println("Titulo: " + doc.getAuthorName());
        System.out.println("Autor: " + doc.getTitle());
        System.out.println("ISBN: " + doc.getIsbn());
        System.out.println("Editorial: " + doc.getPublisher());
        System.out.println("Paginas: " + doc.getNumberOfPagesMedian());


    }
}
