package dad.openlibrary.ui;

import dad.openlibrary.ui.controllers.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpenLibraryApp  extends Application {

    private final RootController rootController = new RootController();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("OpenLibrary");
        primaryStage.setScene(new Scene(rootController.getRoot(), 640, 480));
        primaryStage.show();
    }


}
