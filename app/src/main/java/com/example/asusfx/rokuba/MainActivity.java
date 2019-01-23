package com.example.asusfx.rokuba;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txt;
    Button btnOk;
    String nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.hide();

        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.btnOk);

        txt =  findViewById(R.id.txtNama);
        btnOk.setOnClickListener(this);
    }



    public void onClick(View v){
        String nama = txt.getText().toString();
        if(TextUtils.isEmpty(nama)) {
            txt.setError("Nama Harus Diisi");
        }else{
            findViewById(R.id.btnOk).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setTitle("Konfirmasi");
                    builder.setMessage("Apakah Anda Yakin Data Sudah Benar ? ");

                    builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Data Dimasukkan Ke Database", Toast.LENGTH_SHORT).show();
                            MenuPilihan();
                        }
                    });

                    builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Silahkan Cek Kembali", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.create().show();
                }
            });
        }
    }

    private void MenuPilihan(){
        Intent intent = new Intent(MainActivity.this, MenuPilihan.class);
        finish();
        startActivity(intent);
    }

}
