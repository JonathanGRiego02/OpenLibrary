package dad.openlibrary.ui.controllers;

import dad.openlibrary.api.OpenLibrary;
import dad.openlibrary.api.SearchResult;
import dad.openlibrary.model.Book;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    // Logic
    private final OpenLibrary openLibrary = new OpenLibrary();

    // Model
    private final StringProperty search = new SimpleStringProperty();

    private final ListProperty<Book> books = new SimpleListProperty<>(FXCollections.observableArrayList());

    // View
    @FXML
    private TableView<Book> booksTable;

    @FXML
    private TableColumn<Book, String> ISBNColumn;


    @FXML
    private TableColumn<Book, String> authorColumn;


    @FXML
    private TableColumn<Book, Number> pagesColumn;

    @FXML
    private TableColumn<Book, String> publisherColumn;

    @FXML
    private TableColumn<Book, String> titleColumn;

    @FXML
    private TableColumn<Book, Boolean> hasPagesColumn;

    @FXML
    private BorderPane root;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchText;



    public BorderPane getRoot() {
        return root;
    }

    @FXML
    void onSearchAction(ActionEvent event) {
        try {
            SearchResult result = openLibrary.getBookds(search.get());
            List<Book> bookList = result.getDocs()
                    .stream()
                    .map(Book::new) // .map(doc -> new Book(doc))
                    .toList();
            books.setAll(bookList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public RootController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // cell value factories
        titleColumn.setCellValueFactory(v -> v.getValue().titleProperty());
        authorColumn.setCellValueFactory(v -> v.getValue().authorProperty());
        ISBNColumn.setCellValueFactory(v -> v.getValue().isbnProperty());
        publisherColumn.setCellValueFactory(v -> v.getValue().publisherProperty());
        pagesColumn.setCellValueFactory(v -> v.getValue().numPagesProperty());
        hasPagesColumn.setCellValueFactory(v -> v.getValue().hasPagesProperty());

        // cell factories
        hasPagesColumn.setCellFactory(CheckBoxTableCell.forTableColumn(hasPagesColumn));

        // bindings
        booksTable.itemsProperty().bind(books);
        search.bind(searchText.textProperty());
    }




}
