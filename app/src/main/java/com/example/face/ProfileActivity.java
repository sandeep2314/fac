package com.example.face;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


    public class ProfileActivity extends AppCompatActivity {


        TextView textViewId, textViewUsername, textViewEmail, textViewGender;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_product);

            textViewId = (TextView) findViewById(R.id.textViewId);
            textViewUsername = (TextView) findViewById(R.id.textViewUsername);
            textViewEmail = (TextView) findViewById(R.id.textViewEmail);
            textViewGender = (TextView) findViewById(R.id.textViewGender);

            {

        }
        }
        }