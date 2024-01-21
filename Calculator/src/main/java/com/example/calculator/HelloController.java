package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private Button button2;
    @FXML
    private Button button1;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonSub;
    @FXML
    private Button buttonMul;
    @FXML
    private Button buttonDiv;
    @FXML
    private Button buttonEnter;
    @FXML
    private TextArea answerText;

    public int num1 = 0;
    public int num2 = 0;
    public String mode = "";
    public int currentNum = 1;


    public void updateScreen() {
        if (num1 != 0 && num2 != 0) {
            answerText.setText(num1 + "\n" + mode + num2);
        } else if ( num1 != 0){
            answerText.setText(num1 + "\n" + mode);
        } else if ( num2 != 0){
            answerText.setText( "0\n" + mode + num2);
        } else {
            answerText.setText("\n");
        }
    }

    @FXML
    public void button2Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 2;
        } else {
            num2 = num2 * 10 + 2;
        }
        updateScreen();
    }

    @FXML
    public void button1Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 1;
        } else {
            num2 = num2 * 10 + 1;
        }
        updateScreen();
    }

    @FXML
    public void button3Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 3;
        } else {
            num2 = num2 * 10 + 3;
        }
        updateScreen();
    }

    @FXML
    public void button4Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 4;
        } else {
            num2 = num2 * 10 + 4;
        }
        updateScreen();
    }

    @FXML
    public void button5Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 5;
        } else {
            num2 = num2 * 10 + 5;
        }
        updateScreen();
    }

    @FXML
    public void button6Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 6;
        } else {
            num2 = num2 * 10 + 6;
        }
        updateScreen();
    }

    @FXML
    public void button7Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 7;
        } else {
            num2 = num2 * 10 + 7;
        }
        updateScreen();
    }

    @FXML
    public void button8Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 8;
        } else {
            num2 = num2 * 10 + 8;
        }
        updateScreen();
    }

    @FXML
    public void button9Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10 + 9;
        } else {
            num2 = num2 * 10 + 9;
        }
        updateScreen();
    }

    @FXML
    public void button0Pressed(ActionEvent actionEvent) {
        if (currentNum == 1) {
            num1 = num1 * 10;
        } else {
            num2 = num2 * 10;
        }
        updateScreen();
    }

    @FXML
    public void buttonAddPressed(ActionEvent actionEvent) {
        mode = "+";
        currentNum = 2;
        updateScreen();
    }

    @FXML
    public void buttonSubPressed(ActionEvent actionEvent) {
        mode = "-";
        currentNum = 2;
        updateScreen();
    }

    @FXML
    public void buttonMulPressed(ActionEvent actionEvent) {
        mode = "x";
        currentNum = 2;
        updateScreen();
    }

    @FXML
    public void buttonDivPressed(ActionEvent actionEvent) {
        mode = "/";
        currentNum = 2;
        updateScreen();
    }

    @FXML
    public void buttonEnterPressed(ActionEvent actionEvent) {
        double answer = 0;
        if (mode.equalsIgnoreCase("+")){
            answer = num1 + num2;
        } else if(mode.equalsIgnoreCase("-")){
            answer = num1 - num2;
        } else if(mode.equalsIgnoreCase("x")){
            answer = num1 * num2;
        } else if(mode.equalsIgnoreCase("/")){
            answer = (double) num1 / num2;
        }

        answerText.setText(num1 + "\n" + mode + num2 + "\n" + answer);
        currentNum = 1;
        mode = "";
        num1 = 0;
        num2 = 0;
    }
}