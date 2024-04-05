package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class MyDashboard {
    @FXML Button sponsorsButton;
    @FXML Button charitiesButton;
    private void onSponsorAdded(){ //button to add new sponsor
    }

    @FXML
    private void sponsorButton(){
        WindowHelper.openWindow("sponsor-info.fxml", "Sponsor Info", 750, 750);
    }

    @FXML
    private void allSponsorsButton(){
        WindowHelper.closeWindow(sponsorsButton);
        WindowHelper.openWindow("all-sponsors.fxml", "All Sponsors", 750, 750);
    }

    @FXML
    private void allCharitiesButton(){
        WindowHelper.closeWindow(sponsorsButton);
        WindowHelper.openWindow("all-charities.fxml", "All Charities", 750, 750);
    }
}
