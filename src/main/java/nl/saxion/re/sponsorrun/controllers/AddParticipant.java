package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class AddParticipant {

    @FXML private Button dashboardButton;

    @FXML
    private void dashboardButtonOnClick(){
        WindowHelper.closeWindow(dashboardButton);
        WindowHelper.openWindow("my-dashboard.fxml", "Sponsor Run App", 750, 750);
    }
}
