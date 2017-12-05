package com.zarinpal.libs.sampletoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zarinpal.libs.toast.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // show custom toast
                new Toast(getApplicationContext())
                        .setMessage("zarinpal Toast")
                        .setIcon(R.mipmap.ic_launcher_round)
                        .setColor(Color.GRAY, Color.WHITE)
                        .setDurationToast(Toast.LENGTH_SHORT)
                        .show();
            }
        });


    }
}
