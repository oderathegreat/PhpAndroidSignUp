package com.albaincompaniesltd.app.phpsignup;

import android.app.DownloadManager;
import android.service.voice.VoiceInteractionSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

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

               final String myUsername = username.getText().toString().trim();
               final String myEmail = email.getText().toString().trim();
               final String myPassword = pass.getText().toString().trim();

                StringRequest stringRequest = new StringRequest(Request.Method.POST,
                        Constants.REGISTER_URL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                   //passing my parameters here
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        //on error log and display


                    }
                }){
                    @Override
                    protected Map<String, String> getPostParams() throws AuthFailureError {
                        Map<String,String> params = new HashMap<>();
                        params.put("username", myUsername);
                        params.put("password", myPassword);
                        params.put("email", myEmail);

                        return params;
                        


                    }
                };

            }
        });

    }
}
