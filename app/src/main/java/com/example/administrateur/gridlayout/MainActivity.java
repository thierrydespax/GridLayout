package com.example.administrateur.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import net.sourceforge.jeval.*;


public class MainActivity extends AppCompatActivity {

    private EditText stouche;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);
    }

    public void touche (View v) {

        Button b = (Button) v;
        String str = b.getText().toString();
        String result = txtResult.getText().toString();

        txtResult.setText(result + str);

    }

    public void toucheEgal (View v) throws EvaluationException {

        String result = txtResult.getText().toString();
        Evaluator evaluator = new Evaluator();

        try {
            evaluator.evaluate(result);
            txtResult.setText(evaluator.evaluate(result));
        }
        catch (Exception ex){
            Toast.makeText(this,"Erreur de Syntaxe",Toast.LENGTH_LONG).show();
        }

    }
    public void clear (View v) {
         txtResult.setText("");

    }

}




