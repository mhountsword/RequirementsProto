package nl.saxion.re.sponsorrun.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class SponsorInfo {
    @FXML
    Button dashboardButton;
    @FXML
    public void dashboardButtonOnClick(ActionEvent actionEvent) {
        goToDashboard();
    }
    @FXML
    public void saveButtonOnClick(){
        goToDashboard();
    }
    @FXML
    public void cancelButtonOnClick(){
        goToDashboard();
    }

    private void goToDashboard() {
        WindowHelper.closeWindow(dashboardButton);
    }
}
