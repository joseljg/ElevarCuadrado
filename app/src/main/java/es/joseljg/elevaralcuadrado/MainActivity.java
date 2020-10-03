package es.joseljg.elevaralcuadrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_numero = null;
    private TextView txt_resultado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = (EditText) findViewById(R.id.edt_numero);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado);
    }

    public void elevarAlCuadrado(View view) {
      String textonumero = edt_numero.getText().toString();
      double numero = Double.valueOf(textonumero);
      double resultado = numero * numero;
      resultado = Math.round(resultado * 1000.0) / 1000.0;
      String textoresultado = String.valueOf(resultado);
      txt_resultado.setText(textoresultado);
    }
}