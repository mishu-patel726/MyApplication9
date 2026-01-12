package com.example.myapplication9a;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt_title,txt_user,txt_pass;
    EditText edt_uname,edt_password;
    Button btn_login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FindViewByID();
        Body();
    }

    private void Body()
    {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname,password;
                uname = "admin";
                password="admin";
                if (uname.equals(edt_uname.getText().toString()) && password.equals(edt_password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Login Done", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Not Done", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void FindViewByID()
    {
        edt_uname = findViewById(R.id.edt_uname);
        edt_password = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);
    }
}