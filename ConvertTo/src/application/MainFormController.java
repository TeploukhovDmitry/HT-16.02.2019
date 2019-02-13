package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text resultText;

    @FXML
    private Button tooctButton;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button tohexButton;

    @FXML
    void tohexButtonClick(ActionEvent event) {
    	int a = Integer.parseInt(numberTextField.getText());
    	resultText.setText(Integer.toHexString(a));
    }

    @FXML
    void tooctButtonClick(ActionEvent event) {
    	int a = Integer.parseInt(numberTextField.getText());
    	resultText.setText(Integer.toOctalString(a));
    }

    @FXML
    void initialize() {
        assert resultText != null : "fx:id=\"resultText\" was not injected: check your FXML file 'MainForm.fxml'.";
        assert tooctButton != null : "fx:id=\"tooctButton\" was not injected: check your FXML file 'MainForm.fxml'.";
        assert numberTextField != null : "fx:id=\"nuberTextField\" was not injected: check your FXML file 'MainForm.fxml'.";
        assert tohexButton != null : "fx:id=\"tohexButton\" was not injected: check your FXML file 'MainForm.fxml'.";

    }
}

