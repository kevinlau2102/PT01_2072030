package com.example.pt01a_2072030;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField angka1;
    @FXML
    private TextField angka2;
    @FXML
    private TextField hasil;

    @FXML
    protected void plus() {
        String first = angka1.getText();
        String second = angka2.getText();
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        int totalVal = number1 + number2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
    @FXML
    protected void minus() {
        String first = angka1.getText();
        String second = angka2.getText();
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        int totalVal = number1 - number2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
    @FXML
    protected void multiply() {
        String first = angka1.getText();
        String second = angka2.getText();
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        int totalVal = number1 * number2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
    @FXML
    protected void divide() {
        String first = angka1.getText();
        String second = angka2.getText();
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        int totalVal = number1 / number2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
}