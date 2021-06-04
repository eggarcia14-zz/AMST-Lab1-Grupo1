package com.example.medionline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edituser, editpasswd;
    private Button btnlogin, btnregister;
    private TextView txtwelcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edituser= (EditText) findViewById(R.id.edituser);
        editpasswd= (EditText) findViewById(R.id.edituser);
        btnlogin= (Button) findViewById(R.id.btnlogin);
        btnregister= (Button) findViewById(R.id.btnregister);

    }
    public void registrarse (View view){
        Intent intent = new Intent(this, formulario_registro.class);
        startActivity(intent);
    }
    public void login (View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Usted no cueta con un usuario", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onClick(View v){
        if (v.getId() == R.id.btnlogin) {
            Log.d("mensaje", "ingreso");
        }else if (v.getId()== R.id.btnregister){

        }
        }
    }
