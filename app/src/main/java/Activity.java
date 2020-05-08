import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.face.Login_Activity;
import com.example.face.Product_Activity;
import com.example.face.R;

public class Activity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);




        findViewById(R.id.buttonLogin_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"arjun",Toast.LENGTH_LONG).show();
                finish();
                startActivity(new Intent(Activity.this, Login_Activity.class));





            }
            });
            }
            }