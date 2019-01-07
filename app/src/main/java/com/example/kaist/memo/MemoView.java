package com.example.kaist.memo;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MemoView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memo_view);

        TextView titleview=(TextView)findViewById(R.id.title_view);
        TextView textview=(TextView)findViewById(R.id.text_view);

        String sub_id = getIntent().getStringExtra("id");
        String title=getIntent().getStringExtra("title");
        String text=getIntent().getStringExtra("text");
        titleview.setText(title);
        textview.setText(text);
    }
}

