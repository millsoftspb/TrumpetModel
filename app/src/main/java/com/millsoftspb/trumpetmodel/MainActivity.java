package com.millsoftspb.trumpetmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TrumpetModel trumpet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            trumpet = new TrumpetModel(this);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void clickBtn3(View view) throws IOException {
        trumpet.play("A4");
    }

    public void clickBtn2(View view) throws IOException {
        trumpet.play("B4");
    }

    public void clickBtn(View view) throws IOException {
        trumpet.play("C4");
    }
}
