package com.example.face;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Product_Activity extends AppCompatActivity {



private Button button2;

public URLs urLs;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

finish();
        startActivity(new Intent(Product_Activity.this, MainActivity.class))  ;


findViewById(R.id.buttonLogin_Activity).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
startActivity(new Intent(Product_Activity.this, URLs.class));

    }
});
       };


});
}
}





















