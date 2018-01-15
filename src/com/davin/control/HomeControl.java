package com.davin.control;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class HomeControl {
    @FXML
    private TextField field_num;



    @FXML protected void btn_1(){
        field_num.appendText("1");

    }
    @FXML protected void btn_2(){
        field_num.appendText("2");
    }
    @FXML protected void btn_3(){
        field_num.appendText("3");
    }
    @FXML protected void btn_4(){
        field_num.appendText("4");
    }
    @FXML protected void btn_5(){
        field_num.appendText("5");
    }
    @FXML protected void btn_6(){
        field_num.appendText("6");
    }
    @FXML protected void btn_7(){
        field_num.appendText("7");
    }
    @FXML protected void btn_8(){
        field_num.appendText("8");
    }
    @FXML protected void btn_9(){
        field_num.appendText("9");
    }
    @FXML protected void btn_0(){
        field_num.appendText("0");
    }
    @FXML protected void btn_plus(){
        field_num.appendText(" + ");
    }
    @FXML protected void btn_min(){
        field_num.appendText(" - ");
    }
    @FXML protected void btn_kali(){
        field_num.appendText(" * ");
    }
    @FXML protected void btn_bagi(){
        field_num.appendText(" / ");
    }
    @FXML protected void btn_sd(){
        String a = field_num.getText();
        String b = String.valueOf(calc.evaluasiAngka(a));
        field_num.setText(b);
        System.out.println(b);
    }
    @FXML protected void btn_bs(){
        field_num.setText(field_num.getText().substring(0,field_num.getText().length() -1));

    }
    @FXML protected void btn_clear(){
        field_num.setText("");
    }
    @FXML protected void btn_neg(){
        field_num.appendText("-");
    }
    @FXML protected void btn_kurungbuka(){
        field_num.appendText("( ");
    }
    @FXML protected void btn_kurungtutup(){
        field_num.appendText(" )");

    }

}
