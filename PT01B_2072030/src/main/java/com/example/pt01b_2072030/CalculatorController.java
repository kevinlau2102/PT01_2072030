package com.example.pt01b_2072030;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class CalculatorController {
    @FXML
    private Label temp;
    @FXML
    private int angka1;
    @FXML
    private int angka2;
    @FXML
    private String opr;
    @FXML
    private TextField hasil;
    @FXML
    private TextArea history;

    @FXML
    protected void numberPress(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        hasil.setText(hasil.getText() + value);
    }
    @FXML
    protected void operation(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        angka1 = Integer.parseInt(hasil.getText());
        opr = value;
        temp.setText(angka1 + " " + opr);
        hasil.setText("");
    }
    @FXML
    protected void count() {
        angka2 = Integer.parseInt(hasil.getText());
        temp.setText("");
        switch (opr) {
            case "+" :
                history.setText(history.getText() + "\n" + angka1 + "+" + angka2 + " = " + String.valueOf(angka1+angka2));
                hasil.setText(String.valueOf(angka1+angka2));
                break;
            case "-" :
                history.setText(history.getText() + "\n" + angka1 + "-" + angka2 + " = " + String.valueOf(angka1-angka2));
                hasil.setText(String.valueOf(angka1-angka2));
                break;
            case "*" :
                history.setText(history.getText() + "\n" + angka1 + "*" + angka2 + " = " + String.valueOf(angka1*angka2));
                hasil.setText(String.valueOf(angka1*angka2));
                break;
            case "/" :
                history.setText(history.getText() + "\n" + angka1 + "/" + angka2 + " = " + String.valueOf(angka1/angka2));
                hasil.setText(String.valueOf(angka1/angka2));
                break;
        }
    }
    @FXML
    protected void clear() {
        hasil.setText("");
        temp.setText("");
        opr = "";
    }

}