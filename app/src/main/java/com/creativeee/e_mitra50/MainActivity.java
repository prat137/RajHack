package com.creativeee.e_mitra50;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_username,edt_password;
    Button signin;
    ImageView otpAdhar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_username=findViewById(R.id.edt_username);
        edt_password=findViewById(R.id.edt_password);
        signin=findViewById(R.id.btn_signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt_username.getText().toString().equals("Pratik137"))
                {
                    if(edt_password.getText().toString().equals("Pratik12345"))
                    {
                        Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();
                        Intent i=new Intent(MainActivity.this,LoginSuccessfull.class);
                        startActivity(i);


                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Username",Toast.LENGTH_LONG).show();
                }

            }
        });
        otpAdhar=findViewById(R.id.img_extra);
        otpAdhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Adharotp.class);
                startActivity(i);
            }
        });
    }
}
