package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class MyDashboard {
    @FXML private Pane paneOne;
    @FXML
    private void onSponsorAdded(){ //button to add new sponsor
        WindowHelper.openWindow("test.fxml", "Hello!", 300, 300); //test, can remove
    }

    @FXML
    private void sponsorButton(){
        WindowHelper.openWindow("sponsor-info.fxml", "Sponsor Info", 750, 750);
    }
}
