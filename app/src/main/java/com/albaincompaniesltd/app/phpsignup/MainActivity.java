package com.albaincompaniesltd.app.phpsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, email, pass;
    Button SignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.edtusername);
        email = findViewById(R.id.edtemail);
        pass = findViewById(R.id.edtpassword);
        SignUp = findViewById(R.id.btnSignUp);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

               String myUsername = username.getText().toString().trim();
               String myEmail = email.getText().toString().trim();
               String myPassword = pass.getText().toString().trim();

               

            }
        });

    }
}
