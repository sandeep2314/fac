package com.example.face;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_product);




        findViewById(R.id.buttontextViewRegister_product).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                finish();
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));



            ;}

        });


    }





    }