package com.example.face;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText editTextUsername, editTextEmail, editTextPassword;
    RadioGroup radioGroupGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        findViewById(R.id.button_already_registered).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on button register
                //here we will register the uer to server
                finish();
                startActivity(new Intent(MainActivity.this, ProductActivity.class));

findViewById(R.id.buttonRegister_MainActivity).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
        startActivity(new Intent(MainActivity.this, Login_Activity.class));
          }


});
           }
       });
        }


}
