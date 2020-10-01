package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import operations.Operations;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * Attributes
     */
    private TextView myTextView = null;
    private TextView myTextError = null;
    private String strResultado;
    private String strOperador;
    private String strMostrar;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonResul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(( R.id.textViewOperation));
        myTextError = (TextView) findViewById(R.id.textViewError);
        myTextError.setVisibility(View.INVISIBLE);

        button1 = (Button)findViewById(R.id.btnUno);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.btnDos);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.btnTres);
        button3.setOnClickListener(this);
        button4 = (Button)findViewById(R.id.btnCuatro);
        button4.setOnClickListener(this);
        button5 = (Button)findViewById(R.id.btnCinco);
        button5.setOnClickListener(this);
        button6 = (Button)findViewById(R.id.btnSeis);
        button6.setOnClickListener(this);
        button7 = (Button)findViewById(R.id.btnSiete);
        button7.setOnClickListener(this);
        button8 = (Button)findViewById(R.id.btnOcho);
        button8.setOnClickListener(this);
        button9 = (Button)findViewById(R.id.btnNueve);
        button9.setOnClickListener(this);
        button0 = (Button)findViewById(R.id.btnCero);
        button0.setOnClickListener(this);
        buttonSuma = (Button)findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(this);
        buttonResta = (Button)findViewById(R.id.buttonResta);
        buttonResta.setOnClickListener(this);
        buttonResul = (Button)findViewById(R.id.buttonResul);
        buttonResul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        myTextError.setVisibility(View.INVISIBLE);

        switch (v.getId()){
            case R.id.btnUno:
                funcion1();
                break;
            case R.id.btnDos:
                funcion2();
                break;
            case R.id.btnTres:
                funcion3();
                break;
            case R.id.btnCuatro:
                funcion4();
                break;
            case R.id.btnCinco:
                funcion5();
                break;
            case R.id.btnSeis:
                funcion6();
                break;
            case R.id.btnSiete:
                funcion7();
                break;
            case R.id.btnOcho:
                funcion8();
                break;
            case R.id.btnNueve:
                funcion9();
                break;
            case R.id.btnCero:
                funcion0();
                break;
            case R.id.buttonSuma:
                funcionSuma();
                break;
            case R.id.buttonResta:
                funcionResta();
                break;
            case R.id.buttonResul:
                try {
                    funcionIgual();
                } catch (Exception e) {
                    myTextError.setVisibility(View.VISIBLE);
                    myTextError.setText(getString(R.string.textError));
                }
                break;
        }
    }
    private void funcion1 () {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "1";
        myTextView.setText(strNumero);
    }
    private void funcion2() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "2";
        myTextView.setText(strNumero);
    }
    private void funcion3() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "3";
        myTextView.setText(strNumero);
    }
    private void funcion4() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "4";
        myTextView.setText(strNumero);
    }
    private void funcion5() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "5";
        myTextView.setText(strNumero);
    }
    private void funcion6() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "6";
        myTextView.setText(strNumero);
    }
    private void funcion7() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "7";
        myTextView.setText(strNumero);
    }
    private void funcion8() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "8";
        myTextView.setText(strNumero);
    }
    private void funcion9() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "9";
        myTextView.setText(strNumero);
    }
    private void funcion0() {
        String strNumero = myTextView.getText().toString();
        strNumero = strNumero + "0";
        myTextView.setText(strNumero);
    }
    private void funcionSuma() {
        String strReservar = myTextView.getText().toString();
        strOperador = buttonSuma.getText().toString();
        myTextView.setText(strReservar + strOperador);
    }
    private void funcionResta() {
        String strReservar = myTextView.getText().toString();
        strOperador = buttonResta.getText().toString();
        myTextView.setText(strReservar + strOperador);
    }
    private void funcionIgual() throws Exception {
        strResultado = myTextView.getText().toString();
        myTextView.setText("");
        Operations operations = new Operations();
        strMostrar = operations.doOperation(strResultado);

        myTextView.setText(strMostrar);
    }
}