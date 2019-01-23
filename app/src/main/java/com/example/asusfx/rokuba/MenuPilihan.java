package com.example.asusfx.rokuba;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuPilihan extends AppCompatActivity implements View.OnClickListener {

    LinearLayout LnClassic, LnModern, LnAsin, LnPremium, LnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pilihan);

        LnClassic = findViewById(R.id.LnClassic);
        LnClassic.setOnClickListener(this);

        LnModern = findViewById(R.id.LnModern);
        LnModern.setOnClickListener(this);

        LnPremium = findViewById(R.id.LnPremium);
        LnPremium.setOnClickListener(this);

        LnAsin = findViewById(R.id.LnAsin);
        LnAsin.setOnClickListener(this);

        LnPesan = findViewById(R.id.LnPesan);
        LnPesan.setOnClickListener(this);

    }

    private void menu_classic(){startActivity(new Intent(getApplicationContext(),menu_classic.class));}
    private void menu_modern(){startActivity(new Intent(getApplicationContext(),menu_modern.class));}
    private void menu_premium(){startActivity(new Intent(getApplicationContext(),menu_premium.class));}
    private void menu_asin(){startActivity(new Intent(getApplicationContext(),menu_asin.class));}
    private void menu_pesan(){startActivity(new Intent(getApplicationContext(),menu_pesanan_anda.class));}

    public void onClick(View v){
        if(v == LnClassic) {
           menu_classic();
        }else if(v == LnModern){
            menu_modern();
        }else if(v == LnPremium){
            menu_premium();
        }else if(v == LnAsin){
            menu_asin();
        }else if(v == LnPesan){
            menu_pesan();
        }
    }
}
