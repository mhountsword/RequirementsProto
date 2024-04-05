package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class AllSponsors {
    @FXML
    Button dashboardButton;

    @FXML
    private void openDashboard(){
        WindowHelper.closeWindow(dashboardButton);
        WindowHelper.openWindow("my-dashboard.fxml", "Sponsor Run App", 750, 750);
    }

    @FXML
    private void openSponsorInfo(){
        WindowHelper.openWindow("sponsor-info.fxml", "Sponsor Information", 750, 750);
    }
}
