package com.daretolive.daretolive.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.daretolive.daretolive.R;

public class MainActivity extends AppCompatActivity {

    RelativeLayout affirmation,books;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        init(context);
    }

    private void init(final Context context) {

        affirmation =(RelativeLayout) findViewById(R.id.affirmation_layout);
        books =(RelativeLayout) findViewById(R.id.books_layout);

        affirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Affirmation.class));
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Books.class));
            }
        });
    }
}
