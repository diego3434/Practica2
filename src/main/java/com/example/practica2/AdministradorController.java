package com.example.practica2;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class AdministradorController {
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;

    public boolean Producto1(){
        if(tf4.getText()==null){
            System.out.println("ingrese producto 1");
        }
        return false;
    }
    public boolean Producto2(){
        if(tf5.getText()==null){
            System.out.println("ingrese producto 2");
        }
        return false;
    }
    public boolean Producto3(){
        if(tf6.getText()==null){
            System.out.println("ingrese producto 3");
        }
        return false;
    }
    public boolean Producto4(){
        if(tf7.getText()==null){
            System.out.println("ingrese producto 4");
        }
        return false;
    }

}
