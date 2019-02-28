package com.example.testapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setText("Big button (J2S, v.0.4, r4, mint-h)");

        button.setOnClickListener(v -> {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("From lambda")
                    .setMessage(getString(R.string.hello))
                    .show();
        });
        
        setContentView(button);
    }
}
