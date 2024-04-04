package nl.saxion.re.sponsorrun;

import javafx.application.Application;
import javafx.stage.Stage;
import nl.saxion.re.sponsorrun.util.WindowHelper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class SponsorRunApp extends Application {
    public void start(Stage stage) throws IOException {
        // start the main menu window
        WindowHelper.openWindow("my-dashboard.fxml", "Sponsor Run App", 750, 750, stage);
    }
    public static void main(String[] args) {
        launch();
    }
}