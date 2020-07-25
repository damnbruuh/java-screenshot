package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.robot.Robot;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Controller {

    public Controller() throws IOException {

        Stage mainStage = new Stage();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        mainStage.setScene(new Scene(loader.load()));
        mainStage.setResizable(false);
        mainStage.setTitle("Java Screenshot Program");

        Robot robot = new Robot();

        this.robot = robot;
        this.stage = mainStage;

        mainStage.show();

    }

    private Robot robot;

    private Stage stage;

    @FXML
    private Button btnScreenshot;

    @FXML
    private Button btnDirectory;

    @FXML
    private Label lblFile;

    // TODO: make a class file object for the image

    @FXML
    public void directoryClicked() {

        File file;

        DirectoryChooser dirChooser = new DirectoryChooser();
        dirChooser.setTitle("Choose a directory to save your image");

        file = dirChooser.showDialog(this.stage);
        lblFile.setText(file.getAbsolutePath());

    }

    @FXML
    public void screenshotClicked() {

        // TODO: wait 5 seconds, capture screen and update the label while waiting in realtime





    }

}
