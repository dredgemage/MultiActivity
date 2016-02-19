package com.example.nxt41720.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    private Button mSubButton;
    private EditText mSubEditText;
    Intent intent = getIntent();

    public final static String EXTRA_MESSAGE = "com.example.nxt41720.multiactivity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSubButton = (Button) findViewById(R.id.subButton);
        mSubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                mSubEditText = (EditText) findViewById(R.id.subEditText);
                String message = mSubEditText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
            }
        });
    }

}
