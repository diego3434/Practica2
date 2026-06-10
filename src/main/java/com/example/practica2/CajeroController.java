package com.example.practica2;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CajeroController {
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;

    public boolean cliente(){
        if(tf1.getText()==null){
            System.out.println("ingrese un cliente");
        }
        return true;
    }
    public boolean cedula(){
        if(tf2.getText()==null){
            System.out.println("ingrese una cedula");
        }
        return true;
    }
    public boolean nombre(){
        if(tf3.getText()==null){
            System.out.println("ingrese un nombre");
        }
        return true;
    }

}
