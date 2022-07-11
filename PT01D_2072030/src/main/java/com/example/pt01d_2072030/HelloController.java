package com.example.pt01d_2072030;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label nomorCounter;
    @FXML
    private Label nomorAntri;


    @FXML
    protected void nextAntrian() {
        int x = (int)Math.floor(Math.random()*5)+1;
        int nomor = Integer.parseInt(nomorAntri.getText());
        nomor++;
        nomorAntri.setText(String.valueOf(nomor));
        nomorCounter.setText("Silahkan ke counter " + String.valueOf(x));

    }
}