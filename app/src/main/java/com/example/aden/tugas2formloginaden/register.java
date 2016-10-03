package com.example.aden.tugas2formloginaden;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by adrian on 03/10/2016.
 */
public class register extends AppCompatActivity implements View.OnClickListener {
    Button btnCancel , btnSave;
    EditText user,pass,email,hp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_mahasiswa);

        btnCancel= (Button)findViewById(R.id.BtnCancel);
        btnSave= (Button)findViewById(R.id.BtnSave);
        user = (EditText)findViewById(R.id.edtUsername);
        pass = (EditText)findViewById(R.id.edtPassword);
        email = (EditText)findViewById(R.id.edtEmail);
        hp = (EditText)findViewById(R.id.edtHandphone);
        btnCancel.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.BtnCancel:
                Intent back = new Intent(this,MainActivity.class);
                startActivity(back);
                break;

            case R.id.BtnSave:

                if (user.getText().toString().equals("") || pass.getText().toString().equals("")||email.getText().toString().equals("")|| hp.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Isi Dengan Lengkap Dan Benar",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Selamat anda berhasil mendaftar kedalam system",Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                    email.setText("");
                    hp.setText("");
                }

                break;
            default:
        }
    }
}
