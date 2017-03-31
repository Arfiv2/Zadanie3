package com.example.artur.zadanie3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class ObrazekActivity extends Activity
{
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void zmienObrazek(View view)
    {
        imageView.setImageResource(R.drawable.android2);
    }

    public void Poprzedni(View view)
    {
        imageView.setImageResource(R.drawable.android);
    }

    public void Powrot(View view)
    {
        finish();
    }
}
