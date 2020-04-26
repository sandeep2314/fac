package com.example.face;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        findViewById(R.id.buttonRegister).setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                finish();
               startActivity(new Intent(getApplication(),LoginActivity
                ));
            }
        });
    }





}
