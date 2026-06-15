package com.example.practica2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import java.io.IOException;
import javafx.application.Platform;
public class LoginController {
    @FXML
    private VBox admin;
    @FXML
    private Label welcomeText;
    @FXML
    private Label lbl1;
    @FXML
    private TextField usua;
    @FXML
    private TextField pass;
    @FXML
    private ComboBox<String> cmb1;

    @FXML
    public void initialize() {

        cmb1.getItems().add("Administrador");
        cmb1.getItems().add("Cajero");
    }
    @FXML
    public void validarCredenciales(ActionEvent event) throws IOException {

        String rol = cmb1.getValue();

        if (rol == null) {
            lbl1.setText("Seleccione un rol");
            return;
        }

        if (rol.equals("Administrador")
                && usua.getText().equals("admin123")
                && pass.getText().equals("admin123")) {

            lbl1.setText("Información correcta");

            Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } else if (rol.equals("Cajero")
                && usua.getText().equals("cajero123")
                && pass.getText().equals("cajero123")) {

            lbl1.setText("Información correcta");

            Parent root = FXMLLoader.load(
                    getClass().getResource("cajero.fxml"));

            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();

        } else {
            lbl1.setText("Información incorrecta");
        }
    }


    @FXML
    public void salir() {
        Platform.exit();
    }

}
